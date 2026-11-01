package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۚܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715Z */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC5449 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18794;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18795;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18796;

    public /* synthetic */ CallableC5449(int i, Object obj, Object obj2) {
        this.f18794 = i;
        this.f18796 = obj;
        this.f18795 = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f18794) {
            case 0:
                return C22383.m49655((C22383) this.f18796, (String) this.f18795);
            default:
                return ((C21611) this.f18796).mo10263(((AbstractC20745) this.f18795).m46737(), true);
        }
    }
}
