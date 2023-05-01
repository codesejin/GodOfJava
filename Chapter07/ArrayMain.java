package lang.thegodofjava.Chapter07;

/**
 * Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.
 *
 * You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.
 *
 * See https://docs.gradle.org/7.6.1/userguide/command_line_interface.html#sec:command_line_warnings
 *
 * 이 경고 메시지는 현재 사용 중인 Gradle 버전에서 지원하지 않는 구식 기능(deprecated features)을 사용하여 빌드하고 있다는 것을 알려주는 것입니다.
 * 이 경우에는 Gradle 버전이 업데이트 되면서 사용되지 않는 기능을 사용하고 있어서 나타나는 것입니다.
 * 이는 Gradle의 새로운 버전으로 업데이트하거나 사용 중인 플러그인이 업데이트 되면 문제를 해결할 수 있습니다.
 * 경고 메시지를 해결하려면 Gradle 버전을 업그레이드하거나 더 이상 사용되지 않는 구식 기능을 대체해야 합니다.
 * 또는 이 경고 메시지가 나타나는 이유가 플러그인에서 온 것이라면, 플러그인을 업그레이드하거나 더 이상 사용되지 않는 플러그인을 대체해야 합니다.
 * 경고 메시지를 숨기려면 "--warning-mode all"을 사용하여 개별 경고를 표시할 수 있습니다.
 */
public class ArrayMain {

    public static void main(String[] args) {
        if (args.length > 0) {
            for (String arg : args) {
                System.out.println("arg = " + arg);
            }
        }
    }
}
