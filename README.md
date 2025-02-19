# capacitor-overlay

Provides a simple way to check if the application has permission to overlay other apps on Android.

# Supported Platforms

| Platform | Supported |
| -------- | --------- |
| Android  | ✅        |
| iOS      | ❌        |
| Web      | ❌        |

## Install

```bash
npm install capacitor-overlay
npx cap sync
```

## API

<docgen-index>

* [`checkPermission()`](#checkpermission)
* [`openOverlaySettings()`](#openoverlaysettings)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### checkPermission()

```typescript
checkPermission() => Promise<checkPermissionResult>
```

Returns if the app has overlay permission.

Only available on Android.

**Returns:** <code>Promise&lt;<a href="#checkpermissionresult">checkPermissionResult</a>&gt;</code>

**Since:** 0.0.1

--------------------


### openOverlaySettings()

```typescript
openOverlaySettings() => Promise<void>
```

Opens the Overlay settings page.

Only available on Android.

**Since:** 0.0.1

--------------------


### Interfaces


#### checkPermissionResult

| Prop          | Type                 | Description                        | Since |
| ------------- | -------------------- | ---------------------------------- | ----- |
| **`granted`** | <code>boolean</code> | If the app has overlay permission. | 0.0.1 |

</docgen-api>
