// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "CapacitorOverlay",
    platforms: [.iOS(.v14)],
    products: [
        .library(
            name: "CapacitorOverlay",
            targets: ["CapacitorOverlayPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", from: "7.0.0")
    ],
    targets: [
        .target(
            name: "CapacitorOverlayPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/CapacitorOverlayPlugin"),
        .testTarget(
            name: "CapacitorOverlayPluginTests",
            dependencies: ["CapacitorOverlayPlugin"],
            path: "ios/Tests/CapacitorOverlayPluginTests")
    ]
)