package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4351 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15725;

    public /* synthetic */ C4351(int i) {
        this.f15725 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f15725) {
            case 0:
                break;
            default:
                ((C12510) obj).f40166 = null;
                break;
        }
    }
}
