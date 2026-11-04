package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6C8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13498 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42917;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42918;

    public /* synthetic */ C13498(int i, Object obj) {
        this.f42917 = i;
        this.f42918 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f42917) {
            case 0:
                ((C4789) this.f42918).m44021((C18959) obj);
                break;
            case 1:
                ((C18293) this.f42918).m42623((C21943) obj);
                break;
            default:
                C2551 c2551 = (C2551) this.f42918;
                C17973 c17973 = (C17973) obj;
                if (!c17973.m41943().m51445().mo5564()) {
                    c2551.m31138("Type inference failed for: " + c17973.m41929(c2551));
                }
                if (c17973.m41945().m28517() == null) {
                    c17973.m41945().m28508(AbstractC1566.f5420);
                }
                break;
        }
    }
}
