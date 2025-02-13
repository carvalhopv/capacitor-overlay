import Foundation

@objc public class CapacitorOverlay: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
