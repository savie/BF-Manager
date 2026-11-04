package l;

import java.util.BitSet;
import java.util.HashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T6GT */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17263 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56240;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56241;

    public /* synthetic */ C17263(int i, Object obj) {
        this.f56240 = i;
        this.f56241 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f56240) {
            case 0:
                BitSet bitSet = (BitSet) this.f56241;
                C21943 c21943M49642 = ((C21943) obj).m49642();
                if (c21943M49642 != null) {
                    bitSet.andNot(c21943M49642.m49651());
                    bitSet.clear(c21943M49642.getId());
                }
                break;
            default:
                C8002 c8002 = (C8002) obj;
                ((HashMap) this.f56241).put(c8002.m21848(), c8002);
                break;
        }
    }
}
