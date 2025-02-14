# capacitor-overlay

Provides a simple way to check if the application has permission to overlay other apps on Android.

## Install

```bash
npm install capacitor-overlay
npx cap sync
```

## API

<docgen-index>

* [`checkPermission()`](#checkpermission)
* [`openOverlaySettings()`](#openoverlaysettings)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### checkPermission()

```typescript
checkPermission() => Promise<{ granted: boolean; }>
```

Returns if the app has overlay permission.

Only available on Android.

**Returns:** <code>Promise&lt;{ granted: boolean; }&gt;</code>

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

</docgen-api>
