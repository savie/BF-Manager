package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ᩴᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18916 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f61203;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19622 f61204;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15967 f61205;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10450 f61206;

    public RunnableC18916(C19622 c19622, C10450 c10450, String str, Bundle bundle, C15967 c15967) {
        this.f61204 = c19622;
        this.f61206 = c10450;
        this.f61203 = str;
        this.f61205 = c15967;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((C11260) this.f61204.f62983.f68499.getOrDefault(this.f61206.f35674.getBinder(), null)) == null) {
            return;
        }
        String str = this.f61203;
        C16904 c16904 = new C16904(str, this.f61205);
        c16904.m49804(4);
        c16904.m49807();
        if (!c16904.m49806()) {
            throw new IllegalStateException(C0252.m1693("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }
}
