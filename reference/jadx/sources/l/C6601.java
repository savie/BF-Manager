package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۛᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7TD */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6601 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22086;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f22086) {
            case 0:
                return Integer.compare(((C24501) obj2).f79481, ((C24501) obj).f79481);
            default:
                return Character.compare(((InterfaceC5969) obj).mo14179(), ((InterfaceC5969) obj2).mo14179());
        }
    }
}
