package com.amazonaws.metrics;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class MetricFilterInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ByteThroughputHelper f264;

    @Override // com.amazonaws.internal.SdkFilterInputStream, com.amazonaws.internal.MetricAware
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo273() {
        return true;
    }

    public MetricFilterInputStream(ThroughputMetricType throughputMetricType, InputStream inputStream) {
        super(inputStream);
        this.f264 = new ByteThroughputHelper(throughputMetricType);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        m274();
        ByteThroughputHelper byteThroughputHelper = this.f264;
        byteThroughputHelper.getClass();
        if (TimeUnit.NANOSECONDS.toSeconds(byteThroughputHelper.m345()) > 10 && byteThroughputHelper.m343() > 0) {
            AwsSdkMetrics.m319().getClass();
            byteThroughputHelper.m344();
        }
        long jNanoTime = System.nanoTime();
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 > 0) {
            this.f264.mo342(i3, jNanoTime);
        }
        return i3;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ByteThroughputHelper byteThroughputHelper = this.f264;
        if (byteThroughputHelper.m343() > 0) {
            AwsSdkMetrics.m319().getClass();
            byteThroughputHelper.m344();
        }
        ((FilterInputStream) this).in.close();
        m274();
    }
}
