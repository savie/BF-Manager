package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import l.C9214;
import l.InterfaceC8469;

/* JADX INFO: loaded from: classes.dex */
public abstract class SdkInputStream extends InputStream implements MetricAware, InterfaceC8469 {
    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ۤ */
    public abstract InputStream mo209();

    @Override // com.amazonaws.internal.MetricAware
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo273() {
        Closeable closeableMo209 = mo209();
        if (closeableMo209 instanceof MetricAware) {
            return ((MetricAware) closeableMo209).mo273();
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m276() {
        if (Thread.interrupted()) {
            throw new AbortedException();
        }
    }
}
