package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6563 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22035;

    public /* synthetic */ C6563(int i) {
        this.f22035 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f22035) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f22035) {
            case 0:
                String str = (String) obj;
                return str != null && str.startsWith("/data/app/");
            case 1:
                return C17359.nonNull((C22616) obj);
            case 2:
                return ((C9442) obj).f30619 == 1;
            case 3:
                return ((C17973) obj).m41930().mo17865(EnumC1763.METHOD_ARGUMENT);
            case 4:
                return !((String) obj).equals("java.lang.Exception");
            case 5:
                return !((AbstractC22664) obj).m51067(EnumC21172.BOT);
            default:
                return ((AbstractC22664) obj).mo40455();
        }
    }
}
