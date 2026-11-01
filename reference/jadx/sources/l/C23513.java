package l;

import android.app.Activity;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩻ۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AM8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23513 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2508 f76104;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Executor f76105;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC0228 f76106;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC11138 f76107;

    public C23513(C2508 c2508, Executor executor) {
        C13465.m32966(executor, "executor");
        this.f76104 = c2508;
        this.f76105 = executor;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51777(InterfaceC0228 interfaceC0228) {
        this.f76106 = interfaceC0228;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51776(Activity activity) {
        InterfaceC11138 interfaceC11138 = this.f76107;
        if (interfaceC11138 != null) {
            ((C2339) interfaceC11138).mo7114((CancellationException) null);
        }
        this.f76107 = C22282.m49454(C1820.m5921(new C16077(this.f76105)), new C10813(this, activity, null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51775() {
        InterfaceC11138 interfaceC11138 = this.f76107;
        if (interfaceC11138 == null) {
            return;
        }
        ((C2339) interfaceC11138).mo7114((CancellationException) null);
    }
}
