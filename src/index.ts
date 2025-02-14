import { registerPlugin } from '@capacitor/core';

import type { CapacitorOverlayPlugin } from './definitions';

const CapacitorOverlay = registerPlugin<CapacitorOverlayPlugin>('CapacitorOverlay');

export * from './definitions';
export { CapacitorOverlay };
//# sourceMappingURL=index.js.map
