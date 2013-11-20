@RestController
class Application {

    @RequestMapping('/')
    String home() {
        "Hallo Welt!"
    }
}