package l;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import bin.mt.plus.Main;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8458 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle f27715 = new Bundle();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Class f27716;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27717;

    public C8458(Class cls) {
        this.f27716 = cls;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22719(String str, String str2) {
        this.f27715.putString(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22723(List list) {
        m22722("ARG_PATHS", (String[]) C1170.stream(list).map(new C4527(2)).toArray(new C1001()));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m22727(List list) {
        m22722("ARG_PATHS", (String[]) C1170.stream(list).map(new C10080(3)).toArray(new C9203()));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22730(List list) {
        m22722("ARG_PATHS", (String[]) C1170.stream(list).map(new C3900(4)).toArray(new C2492()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22717(Main main, C9651 c9651) {
        if (c9651 == null) {
            return;
        }
        try {
            try {
                m22721("ARG_SIGNATURE_OPTIONS", c9651.m25167());
            } catch (IOException e) {
                main.m40401(e, (DialogInterface.OnDismissListener) null);
                this.f27717 = true;
            }
        } finally {
            c9651.m25168().mo18535();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22724(AbstractC7364 abstractC7364) {
        m22721("ARG_STATELESS_VISITOR", abstractC7364.mo10174().m20838());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m22728(C12915 c12915) {
        Bundle bundle = this.f27715;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c12915.m31983().m23195());
        }
        bundle.putString("ARG_CURRENT_WINDOW_DIGEST", c12915.m31983().m23190());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22725(C8614 c8614) {
        Bundle bundle = this.f27715;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c8614.m23195());
        }
        bundle.putString("ARG_CURRENT_WINDOW_DIGEST", c8614.m23190());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22726(C12915 c12915) {
        Bundle bundle = this.f27715;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c12915.m31983().m23195());
        }
        bundle.putString("ARG_ANOTHER_WINDOW_DIGEST", c12915.m31974().m23190());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22731(C12915 c12915) {
        Bundle bundle = this.f27715;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c12915.m31983().m23195());
        }
        bundle.putString("ARG_CURRENT_WINDOW_DIGEST", c12915.m31983().m23190());
        bundle.putString("ARG_ANOTHER_WINDOW_DIGEST", c12915.m31974().m23190());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22722(String str, String[] strArr) {
        C6178 c6178 = new C6178();
        c6178.writeInt(strArr.length);
        for (String str2 : strArr) {
            c6178.m17786((CharSequence) str2);
        }
        m22721(str, c6178.m17799());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22715(int i, String str) {
        this.f27715.putInt(str, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22716(long j, String str) {
        this.f27715.putLong(str, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22720(String str, boolean z) {
        this.f27715.putBoolean(str, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22721(String str, byte[] bArr) {
        int length = bArr.length;
        Bundle bundle = this.f27715;
        if (length > 51200) {
            AbstractC22044 abstractC22044M49877 = C6382.f21565.m49877();
            try {
                abstractC22044M49877.m49850(bArr, 0, bArr.length);
                bundle.putString(str, abstractC22044M49877.mo4294());
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        bundle.putByteArray(str, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22718(String str, Serializable serializable) {
        this.f27715.putSerializable(str, serializable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22714() {
        if (this.f27717) {
            return -1;
        }
        int iIncrementAndGet = AbstractC18900.f61319.incrementAndGet();
        Application applicationM49084 = C21576.m49084();
        Intent intent = new Intent(applicationM49084, (Class<?>) ServiceC19096.class);
        intent.putExtra("TaskClass", this.f27716);
        intent.putExtra("TaskId", iIncrementAndGet);
        intent.putExtra("TaskArgument", this.f27715);
        C7508.m20562(applicationM49084, intent);
        return iIncrementAndGet;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m22729() {
        if (this.f27717) {
            return -1;
        }
        Bundle bundle = this.f27715;
        Class cls = this.f27716;
        int iIncrementAndGet = AbstractC18900.f61319.incrementAndGet();
        try {
            AbstractC18900 abstractC18900 = (AbstractC18900) cls.newInstance();
            Intent intent = new Intent();
            intent.putExtra("TaskId", iIncrementAndGet);
            intent.putExtra("TaskArgument", bundle);
            abstractC18900.mo36391(intent);
            C5261.f18540.submit(new RunnableC6967(null, abstractC18900, 0));
            return iIncrementAndGet;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
