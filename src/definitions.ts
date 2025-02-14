export interface CapacitorOverlayPlugin {
  /**
   * Returns if the app has overlay permission.
   *
   * Only available on Android.
   *
   * @since 0.0.1
   */
  checkPermission(): Promise<{ granted: boolean }>;
  /**
   * Opens the Overlay settings page.
   *
   * Only available on Android.
   *
   * @since 0.0.1
   */
  openOverlaySettings(): Promise<void>;
}
/**
 * @since 0.0.1
 */
export declare enum ErrorCode {
  /**
   * The picker was canceled by the user.
   *
   * @since 0.0.1
   */
  unavailable = 'unavailable',
}
