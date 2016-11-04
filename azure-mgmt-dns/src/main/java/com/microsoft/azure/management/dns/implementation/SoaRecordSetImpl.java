package com.microsoft.azure.management.dns.implementation;

import com.microsoft.azure.management.dns.SoaRecord;
import com.microsoft.azure.management.dns.SoaRecordSet;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import rx.Observable;
import rx.functions.Func1;

/**
 * Implementation of {@link SoaRecordSet}.
 */
class SoaRecordSetImpl
        extends DnsRecordSetImpl
        implements
            SoaRecordSet,
            SoaRecordSet.Update {
    SoaRecordSetImpl(final DnsZoneImpl parentDnsZone, final RecordSetInner innerModel, final RecordSetsInner client) {
        super(parentDnsZone, innerModel, client);
    }

    @Override
    public SoaRecord record() {
        return this.inner().soaRecord();
    }

    @Override
    public SoaRecordSetImpl refresh() {
        return this;
    }

    @Override
    protected RecordSetInner merge(RecordSetInner resource, RecordSetInner recordSetRemoveInfo) {
        return null;
    }

    @Override
    public SoaRecordSetImpl withEmailServer(String emailServerHostName) {
        this.inner().soaRecord().withEmail(emailServerHostName);
        return this;
    }

    @Override
    public SoaRecordSetImpl withExpireTimeInSeconds(long expireTimeInSeconds) {
        this.inner().soaRecord().withExpireTime(expireTimeInSeconds);
        return this;
    }

    @Override
    public SoaRecordSetImpl withNegativeResponseCachingTimeToLiveInSeconds(long negativeCachingTimeToLive) {
        this.inner().soaRecord().withMinimumTtl(negativeCachingTimeToLive);
        return this;
    }

    @Override
    public SoaRecordSetImpl withRefreshTimeInSeconds(long refreshTimeInSeconds) {
        this.inner().soaRecord().withRefreshTime(refreshTimeInSeconds);
        return this;
    }

    @Override
    public SoaRecordSetImpl withRetryTimeInSeconds(long refreshTimeInSeconds) {
        this.inner().soaRecord().withRetryTime(refreshTimeInSeconds);
        return this;
    }

    @Override
    public SoaRecordSetImpl withSerialNumber(long serialNumber) {
        this.inner().soaRecord().withSerialNumber(serialNumber);
        return this;
    }

    @Override
    public SoaRecordSet apply() {
        return null;
    }

    @Override
    public Observable<SoaRecordSet> applyAsync() {
        return null;
    }

    @Override
    public ServiceCall<SoaRecordSet> applyAsync(ServiceCallback<SoaRecordSet> callback) {
        return null;
    }
}
