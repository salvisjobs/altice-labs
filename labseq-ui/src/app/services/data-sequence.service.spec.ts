import { TestBed } from '@angular/core/testing';

import { DataSequenceService } from './data-sequence.service';

describe('DataSequenceService', () => {
  let service: DataSequenceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DataSequenceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
