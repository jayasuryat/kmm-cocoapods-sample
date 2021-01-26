import SwiftUI
import shared

private let greetings = Greeting()
private let networkHelper = NetworkHelper()

private func greet() -> String{
    return Greeting().greeting()
}

private func getisNetworkAvailable() -> String{
    return networkHelper.isNetAvailable()
}

struct ContentView: View {
    
    @State var isNetworkAvailable = "false"
    var body: some View {
        VStack {
            Spacer()
            Text(greet())
            Text("IsNetwokrAvailable : " + self.isNetworkAvailable)
            Spacer()
            Button(action: {
                self.isNetworkAvailable = getisNetworkAvailable()
            }) {
                Text("Refresh")
            }
            Spacer()
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
