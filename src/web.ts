import { WebPlugin } from '@capacitor/core';

import type { CapacitorOverlayPlugin } from './definitions';

export class CapacitorOverlayWeb extends WebPlugin implements CapacitorOverlayPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
