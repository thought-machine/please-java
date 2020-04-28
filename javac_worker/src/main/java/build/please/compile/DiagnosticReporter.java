package build.please.compile;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import javax.tools.JavaFileObject;
import java.util.Locale;

class DiagnosticReporter implements DiagnosticListener<JavaFileObject> {

  private BuildResponse response;

  DiagnosticReporter(BuildResponse response) {
    this.response = response;
  }

  @Override
  public void report(Diagnostic<? extends JavaFileObject> diagnostic) {
    // No i18n here obviously...
    if (diagnostic.getSource() != null) {
      response.withMessage(diagnostic.getSource().getName() + ":" + diagnostic.getLineNumber() + ":" +
          diagnostic.getColumnNumber() + ": " + diagnostic.getMessage(Locale.ENGLISH));
    } else {
      response.withMessage(diagnostic.getMessage(Locale.ENGLISH));
    }
  }
}
