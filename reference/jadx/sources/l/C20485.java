package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9Q3 */
/* JADX INFO: loaded from: classes5.dex */
public class C20485 extends C24215 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C20485 f65620 = new C20485(0);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Map f65621;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Map f65622;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Map f65623;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Map f65624;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C20485 m46986() {
        return new C20485();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3331 m46987(C24478 c24478, int i) {
        return (C3331) this.f65623.get(new C23469(c24478, i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46988(C9780 c9780) {
        C3331 c3331;
        Map map;
        Map map2;
        if (c9780.m25505() == EnumC24961.IMMUTABLE || c9780.m25505() == EnumC24961.MUTABLE) {
            if (c9780.mo25504().m20086() == EnumC2848.MESSAGE) {
                if (c9780.mo25502() == null) {
                    throw new IllegalStateException("Registered message-type extension had null default instance: " + c9780.mo25504().mo5002());
                }
                c3331 = new C3331(c9780.mo25504(), c9780.mo25502());
            } else {
                c3331 = new C3331(c9780.mo25504(), null);
            }
            EnumC24961 enumC24961M25505 = c9780.m25505();
            C7323 c7323 = c3331.f10901;
            if (!c7323.m20083()) {
                throw new IllegalArgumentException("ExtensionRegistry.add() was given a FieldDescriptor for a regular (non-extension) field.");
            }
            int i = C16009.f51951[enumC24961M25505.ordinal()];
            if (i == 1) {
                map = this.f65624;
                map2 = this.f65623;
            } else {
                if (i != 2) {
                    return;
                }
                map = this.f65622;
                map2 = this.f65621;
            }
            map.put(c7323.mo5002(), c3331);
            map2.put(new C23469(c7323.m20099(), c7323.getNumber()), c3331);
            if (c7323.m20099().m54744().m17896() && c7323.getType() == EnumC8814.f28803 && c7323.m20091() && c7323.m20087() == c7323.m20093()) {
                map.put(c7323.m20093().mo5002(), c3331);
            }
        }
    }

    public C20485() {
        this.f65624 = new HashMap();
        this.f65622 = new HashMap();
        this.f65623 = new HashMap();
        this.f65621 = new HashMap();
    }

    public C20485(int i) {
        super(C24215.f78465);
        Map map = Collections.EMPTY_MAP;
        this.f65624 = map;
        this.f65622 = map;
        this.f65623 = map;
        this.f65621 = map;
    }
}
