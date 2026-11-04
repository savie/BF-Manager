package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T6GT */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16517 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53485;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53486;

    public /* synthetic */ C16517(int i, Object obj) {
        this.f53485 = i;
        this.f53486 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f53485) {
            case 0:
                ((BitSet) this.f53486).and(((C21943) obj).m49651());
                break;
            case 1:
                ((ArrayList) this.f53486).add((C22919) obj);
                break;
            case 2:
                C11260 c11260 = (C11260) this.f53486;
                C17973 c17973 = (C17973) obj;
                if (c17973.m41928()) {
                    c11260.m28510(c17973.m41945());
                }
                c17973.m41934(c11260);
                break;
            default:
                ((AbstractC11781) this.f53486).m29580((C14769) obj);
                break;
        }
    }
}
