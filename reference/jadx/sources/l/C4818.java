package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B9Q3 */
/* JADX INFO: loaded from: classes3.dex */
public class C4818 extends C2701 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C4818 f16954 = new C4818(0);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Map f16955;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Map f16956;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Map f16957;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Map f16958;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C4818 m13398() {
        return new C4818();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3511 m13399(C2806 c2806, int i) {
        return (C3511) this.f16957.get(new C9863(c2806, i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13400(C15424 c15424) {
        C3511 c3511;
        Map map;
        Map map2;
        if (c15424.m36895() == EnumC11274.IMMUTABLE || c15424.m36895() == EnumC11274.MUTABLE) {
            if (c15424.mo36901().m44913() == EnumC19035.MESSAGE) {
                if (c15424.mo36899() == null) {
                    throw new IllegalStateException("Registered message-type extension had null default instance: " + c15424.mo36901().mo8523());
                }
                c3511 = new C3511(c15424.mo36901(), c15424.mo36899());
            } else {
                c3511 = new C3511(c15424.mo36901(), null);
            }
            EnumC11274 enumC11274M36895 = c15424.m36895();
            C19741 c19741 = c3511.f12865;
            if (!c19741.m44908()) {
                throw new IllegalArgumentException("ExtensionRegistry.add() was given a FieldDescriptor for a regular (non-extension) field.");
            }
            int i = C2100.f7742[enumC11274M36895.ordinal()];
            if (i == 1) {
                map = this.f16956;
                map2 = this.f16957;
            } else {
                if (i != 2) {
                    return;
                }
                map = this.f16958;
                map2 = this.f16955;
            }
            map.put(c19741.mo8523(), c3511);
            map2.put(new C9863(c19741.m44910(), c19741.getNumber()), c3511);
            if (c19741.m44910().m8525().m29472() && c19741.getType() == EnumC8452.f29310 && c19741.m44899() && c19741.m44902() == c19741.m44907()) {
                map.put(c19741.m44907().mo8523(), c3511);
            }
        }
    }

    public C4818() {
        this.f16956 = new HashMap();
        this.f16958 = new HashMap();
        this.f16957 = new HashMap();
        this.f16955 = new HashMap();
    }

    public C4818(int i) {
        super(C2701.f10402);
        Map map = Collections.EMPTY_MAP;
        this.f16956 = map;
        this.f16958 = map;
        this.f16957 = map;
        this.f16955 = map;
    }
}
