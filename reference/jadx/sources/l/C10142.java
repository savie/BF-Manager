package l;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import bin.mt.plus.Main;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10142 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle f34636 = new Bundle();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Class f34637;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f34638;

    public C10142(Class cls) {
        this.f34637 = cls;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25768(String str, String str2) {
        this.f34636.putString(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25772(List list) {
        m25771("ARG_PATHS", (String[]) C9030.stream(list).map(new C4686(1)).toArray(new C8025()));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25776(List list) {
        m25771("ARG_PATHS", (String[]) C9030.stream(list).map(new C13874(3)).toArray(new C19314(0)));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25779(List list) {
        m25771("ARG_PATHS", (String[]) C9030.stream(list).map(new C18663(4)).toArray(new C8731(0)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25766(Main main, C14558 c14558) {
        if (c14558 == null) {
            return;
        }
        try {
            try {
                m25770("ARG_SIGNATURE_OPTIONS", c14558.m35032());
            } catch (IOException e) {
                main.m31002(e, (DialogInterface.OnDismissListener) null);
                this.f34638 = true;
            }
        } finally {
            c14558.m35031().mo1458();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25773(AbstractC11462 abstractC11462) {
        m25770("ARG_STATELESS_VISITOR", abstractC11462.mo13029().m24619());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25777(C21422 c21422) {
        Bundle bundle = this.f34636;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c21422.m47965().m28762());
        }
        bundle.putString("ARG_CURRENT_WINDOW_DIGEST", c21422.m47965().m28808());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25774(C11545 c11545) {
        Bundle bundle = this.f34636;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c11545.m28762());
        }
        bundle.putString("ARG_CURRENT_WINDOW_DIGEST", c11545.m28808());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25775(C21422 c21422) {
        Bundle bundle = this.f34636;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c21422.m47965().m28762());
        }
        bundle.putString("ARG_ANOTHER_WINDOW_DIGEST", c21422.m47970().m28808());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25780(C21422 c21422) {
        Bundle bundle = this.f34636;
        if (!bundle.containsKey("ARG_CURRENT_WINDOW_LEFT")) {
            bundle.putBoolean("ARG_CURRENT_WINDOW_LEFT", c21422.m47965().m28762());
        }
        bundle.putString("ARG_CURRENT_WINDOW_DIGEST", c21422.m47965().m28808());
        bundle.putString("ARG_ANOTHER_WINDOW_DIGEST", c21422.m47970().m28808());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25771(String str, String[] strArr) {
        C11018 c11018 = new C11018();
        c11018.writeInt(strArr.length);
        for (String str2 : strArr) {
            c11018.m27782((CharSequence) str2);
        }
        m25770(str, c11018.m27798());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25764(int i, String str) {
        this.f34636.putInt(str, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25765(long j, String str) {
        this.f34636.putLong(str, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25769(String str, boolean z) {
        this.f34636.putBoolean(str, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25770(String str, byte[] bArr) {
        int length = bArr.length;
        Bundle bundle = this.f34636;
        if (length > 51200) {
            AbstractC20745 abstractC20745M46728 = C11904.f39939.m46728();
            try {
                abstractC20745M46728.m46704(bArr, 0, bArr.length);
                bundle.putString(str, abstractC20745M46728.mo33986());
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        bundle.putByteArray(str, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25767(String str, Serializable serializable) {
        this.f34636.putSerializable(str, serializable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25763() {
        if (this.f34638) {
            return -1;
        }
        int iIncrementAndGet = AbstractC17902.f56690.incrementAndGet();
        Application applicationM39277 = C16737.m39277();
        Intent intent = new Intent(applicationM39277, (Class<?>) ServiceC23236.class);
        intent.putExtra("TaskClass", this.f34637);
        intent.putExtra("TaskId", iIncrementAndGet);
        intent.putExtra("TaskArgument", this.f34636);
        C10405.m26303(applicationM39277, intent);
        return iIncrementAndGet;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m25778() {
        if (this.f34638) {
            return -1;
        }
        Bundle bundle = this.f34636;
        Class cls = this.f34637;
        int iIncrementAndGet = AbstractC17902.f56690.incrementAndGet();
        try {
            AbstractC17902 abstractC17902 = (AbstractC17902) cls.newInstance();
            Intent intent = new Intent();
            intent.putExtra("TaskId", iIncrementAndGet);
            intent.putExtra("TaskArgument", bundle);
            abstractC17902.mo2976(intent);
            C4716.f16636.submit(new RunnableC7319(null, abstractC17902, 0));
            return iIncrementAndGet;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
