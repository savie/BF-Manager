package l;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;

/* JADX INFO: renamed from: l.ᩳۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D6J8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18762 extends PrintDocumentAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PrintDocumentAdapter f60932;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9811 f60933;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f60934;

    public C18762(C9811 c9811, PrintDocumentAdapter printDocumentAdapter) {
        this.f60933 = c9811;
        this.f60932 = printDocumentAdapter;
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onStart() {
        if (this.f60934) {
            return;
        }
        this.f60932.onStart();
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        if (this.f60934) {
            layoutResultCallback.onLayoutCancelled();
        } else {
            this.f60932.onLayout(printAttributes, printAttributes2, cancellationSignal, layoutResultCallback, bundle);
        }
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        if (this.f60934) {
            writeResultCallback.onWriteCancelled();
        } else {
            this.f60932.onWrite(pageRangeArr, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onFinish() {
        C9811 c9811 = this.f60933;
        if (this.f60934) {
            return;
        }
        this.f60934 = true;
        try {
            this.f60932.onFinish();
        } finally {
            if (c9811.f31604 == this) {
                c9811.f31604 = null;
            }
        }
    }
}
