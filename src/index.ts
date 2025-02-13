import { registerPlugin } from '@capacitor/core';

import type { CapacitorOverlayPlugin } from './definitions';

const CapacitorOverlay = registerPlugin<CapacitorOverlayPlugin>('CapacitorOverlay', {
  web: () => import('./web').then((m) => new m.CapacitorOverlayWeb()),
});

export * from './definitions';
export { CapacitorOverlay };
