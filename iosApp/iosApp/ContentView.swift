import SwiftUI
import shared

func greet() -> String {
    return Greeting().greeting()
}

func isNetworkAvailable() -> String{
    return Greeting().isNetAvailable()
}

struct ContentView: View {
    var body: some View {
        Text(greet() + " " +  isNetworkAvailable())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
