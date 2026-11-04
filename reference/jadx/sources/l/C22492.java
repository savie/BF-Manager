package l;

import android.os.Bundle;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22492 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72780;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72781;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72782;

    public /* synthetic */ C22492(int i, Object obj, Object obj2) {
        this.f72780 = i;
        this.f72782 = obj;
        this.f72781 = obj2;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f72780) {
            case 0:
                ActivityC3846.m12408((ActivityC3846) this.f72782, (Bundle) this.f72781, (Boolean) obj);
                break;
            default:
                C18345.m42799((C18345) this.f72782, (C24927) this.f72781, (C17467) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
