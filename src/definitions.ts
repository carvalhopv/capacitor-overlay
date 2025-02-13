export interface CapacitorOverlayPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
