package l;

import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6B2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2551 extends AbstractC12531 implements InterfaceC21197, Comparable {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final C18959[] f8164;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f8165;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f8166;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f8167;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public List f8168;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C21943 f8169;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C21965 f8170;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C21943 f8171;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C10293 f8172;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C25160 f8173;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List f8174;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f8175;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C18959[] f8176;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C24927 f8177;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public List f8178;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f8179;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f8180;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public List f8181;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public List f8182;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f8183;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public AbstractC1566 f8184;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f8185;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f8186;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public List f8187;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final int f8188;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C0908 f8189;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C6041 f8190;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public C12050 f8191;

    @Override // l.InterfaceC24181
    public final String typeName() {
        return e.s;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean mo1794() {
        return false;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C11457.f35998;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8170.compareTo(((C2551) obj).f8170);
    }

    static {
        C16980.m40037(C2551.class);
        f8164 = new C18959[0];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2551 m8487(C24927 c24927, InterfaceC2704 interfaceC2704) {
        C2551 c2551 = new C2551(c24927, interfaceC2704);
        c2551.m39411((List) interfaceC2704.getAttributes());
        return c2551;
    }

    public C2551(C24927 c24927, InterfaceC2704 interfaceC2704) {
        List list = Collections.EMPTY_LIST;
        this.f8178 = list;
        this.f8187 = list;
        this.f8179 = new HashSet();
        C21965 c21965M49693 = C21965.m49693(c24927.mo8527(), interfaceC2704.mo8888());
        this.f8170 = c21965M49693;
        this.f8177 = c24927;
        this.f8172 = new C10293(interfaceC2704.mo8889(), EnumC19244.METHOD);
        C25160 c25160Mo8890 = interfaceC2704.mo8890();
        if (c25160Mo8890 == null) {
            this.f8166 = true;
            this.f8173 = null;
            this.f8188 = 0;
        } else {
            this.f8166 = false;
            this.f8173 = c25160Mo8890.m56073();
            this.f8188 = c25160Mo8890.m56077();
        }
        this.f8184 = c21965M49693.m49698();
        this.f8185 = c21965M49693.m49702();
        this.f8168 = list;
        m8544();
    }

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public final void m8544() {
        this.f8186 = false;
        this.f8190 = null;
        this.f8175 = null;
        List list = Collections.EMPTY_LIST;
        this.f8182 = list;
        this.f8176 = null;
        this.f8174 = null;
        this.f8167 = 0;
        this.f8171 = null;
        this.f8169 = null;
        this.f8191 = null;
        this.f8180 = list;
        this.f8181 = list;
        m39416();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8500(AbstractC1566 abstractC1566, List list) {
        this.f8185 = list;
        this.f8184 = abstractC1566;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m8538(List list) {
        this.f8168 = list;
    }

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public final void m8531() throws C19039 {
        C25160 c25160 = this.f8173;
        if (this.f8186) {
            return;
        }
        try {
            this.f8186 = true;
            if (this.f8166) {
                this.f8183 = 0;
                m8488(this.f8185);
                return;
            }
            this.f8183 = c25160.m56076();
            this.f8165 = -1;
            m8488(this.f8185);
            if (mo17867(C11457.f36007)) {
                this.f8176 = f8164;
                return;
            }
            C6303 c6303 = new C6303(this);
            C18959[] c18959Arr = new C18959[c25160.m56077()];
            c25160.m56075(new C20473(0, c6303, c18959Arr));
            this.f8176 = c18959Arr;
        } catch (Exception e) {
            if (!this.f8166) {
                m8544();
                this.f8166 = true;
                m8531();
                this.f8166 = false;
            }
            throw new C19039(this, "Load method exception: " + e.getClass().getSimpleName() + ": " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m8488(List list) {
        int iM5568;
        if (this.f8166) {
            iM5568 = 0;
        } else {
            iM5568 = this.f8165;
            if (iM5568 == -1) {
                iM5568 = this.f8183;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iM5568 -= ((AbstractC1566) it.next()).m5568();
                }
                if (!this.f8172.m26540()) {
                    iM5568--;
                }
            }
        }
        C24927 c24927 = this.f8177;
        C3101 c3101M5692 = c24927.mo8527().m5692();
        if (this.f8172.m26540()) {
            this.f8190 = null;
        } else {
            AbstractC1566 type = c24927.getType();
            c3101M5692.getClass();
            C3101.m10100(this, type);
            int i = AbstractC16481.f53441;
            C6041 c6041 = new C6041(iM5568, type);
            c6041.mo17866(EnumC1763.THIS);
            c6041.mo17866(EnumC1763.IMMUTABLE_TYPE);
            this.f8190 = c6041;
            iM5568++;
        }
        if (list.isEmpty()) {
            this.f8175 = Collections.EMPTY_LIST;
            return;
        }
        this.f8175 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC1566 abstractC1566 = (AbstractC1566) it2.next();
            c3101M5692.getClass();
            C3101.m10100(this, abstractC1566);
            int i2 = AbstractC16481.f53441;
            C6041 c6042 = new C6041(iM5568, abstractC1566);
            c6042.mo17866(EnumC1763.METHOD_ARGUMENT);
            c6042.mo17866(EnumC1763.IMMUTABLE_TYPE);
            this.f8175.add(c6042);
            iM5568 += abstractC1566.m5568();
        }
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List mo8537() {
        List list = this.f8185;
        if (list != null) {
            return list;
        }
        throw new C8597("Method generic types not initialized: " + this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8549(ArrayList arrayList) {
        m31133("Method arguments types fixed to match base method, original types: " + mo8537());
        this.f8185 = C4681.unmodifiableList(arrayList);
        m8488(arrayList);
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 mo8519() {
        return this.f8184;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8551(AbstractC1566 abstractC1566) {
        this.f8184 = abstractC1566;
    }

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m8534() {
        return this.f8170.m49698().equals(AbstractC1566.f5416);
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final List m8526() {
        List list = this.f8175;
        if (list != null) {
            return list;
        }
        throw new C8597("Method arg registers not loaded: " + this + ", class status: " + this.f8177.m55556().getState());
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final List m8540() {
        List listM8526 = m8526();
        if (this.f8190 == null) {
            return listM8526;
        }
        ArrayList arrayList = new ArrayList(listM8526.size() + 1);
        arrayList.add(this.f8190);
        arrayList.addAll(listM8526);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final C6041 m8517() {
        return this.f8190;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List mo8554() {
        return this.f8168;
    }

    public final String getName() {
        return this.f8170.getName();
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final String m8522() {
        return this.f8170.m49696();
    }

    @Override // l.InterfaceC20451
    public final C24927 getDeclaringClass() {
        return this.f8177;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final C24927 m8536() {
        return this.f8177;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final C24927 m8516() {
        return this.f8177.m55556();
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final String m8559() {
        return C18476.m43056(this, this.f8177.m55556().m55548());
    }

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m8524() {
        return this.f8166;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18959[] m8506() {
        return this.f8176;
    }

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public final void m8525() {
        this.f8176 = null;
    }

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public final void m8541() {
        this.f8174 = new ArrayList();
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final void m8552() {
        this.f8174 = C4123.m13230(this.f8174);
        this.f8181 = C4123.m13230(this.f8181);
        C4937.forEach(this.f8174, new C1060());
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final List m8508() {
        return this.f8174;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8498(ArrayList arrayList) {
        this.f8174 = arrayList;
        m8512();
    }

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public final void m8512() {
        C21943.m49632(this.f8174);
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final int m8546() {
        int i = this.f8167;
        this.f8167 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m8535() {
        return this.f8171;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m8556(C21943 c21943) {
        this.f8171 = c21943;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m8491() {
        return this.f8169;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m8539(C21943 c21943) {
        this.f8169 = c21943;
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final List m8489() {
        return this.f8169.m49643();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m8521(C21943 c21943) {
        List listM49646 = c21943.m49646();
        if (listM49646.size() == 1) {
            return ((C21943) listM49646.get(0)).equals(this.f8169);
        }
        return this.f8169.m49643().contains(c21943);
    }

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public final void m8492() {
        this.f8181 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8502(C11785 c11785) {
        if (this.f8181.isEmpty()) {
            this.f8181 = new ArrayList(5);
        }
        c11785.m29614(this.f8181.size());
        this.f8181.add(c11785);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11785 m8548(C21943 c21943) {
        if (this.f8181.isEmpty()) {
            return null;
        }
        for (C11785 c11785 : this.f8181) {
            if (((HashSet) c11785.m29620()).contains(c21943)) {
                return c11785;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m8494(C21943 c21943) {
        if (this.f8181.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.f8181.size());
        for (C11785 c11785 : this.f8181) {
            if (((HashSet) c11785.m29620()).contains(c21943)) {
                arrayList.add(c11785);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final int m8528() {
        return this.f8181.size();
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final List m8558() {
        return this.f8181;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8505(C19684 c19684) {
        if (this.f8180.isEmpty()) {
            this.f8180 = new ArrayList(2);
        }
        this.f8180.add(c19684);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m8513() {
        C1170.removeIf(this.f8180, new C19907(2));
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final List m8530() {
        return this.f8180;
    }

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public final boolean m8560() {
        return this.f8180.isEmpty();
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final int m8557() {
        return this.f8180.size();
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final List mo8542() {
        C3582 c3582 = (C3582) mo17862((InterfaceC2157) C11457.f35999);
        if (c3582 != null) {
            return C4123.m13226(c3582.m11641(), new C19705(0));
        }
        C20802 c20802 = (C20802) mo17862(C25278.f81642);
        if (c20802 != null) {
            return C4123.m13226(c20802.m47582(), new C19705(0));
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m8529() {
        return this.f8172.m26543() && this.f8170.m49703();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m8509() {
        int i;
        if (!m8529()) {
            return false;
        }
        C24927 c24927 = this.f8177;
        if (!c24927.m55571().m4962() || c24927.mo8547().m26540()) {
            i = 0;
        } else {
            C24927 c24927M55574 = c24927.m55574();
            List list = this.f8175;
            if (list == null || list.isEmpty() || !((C6041) this.f8175.get(0)).m17531().equals(c24927M55574.m55571().getType())) {
                i = 0;
            } else {
                i = 1;
            }
        }
        List list2 = this.f8175;
        return list2 == null || list2.size() == i;
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final int m8518() {
        return this.f8183;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6041 m8495(AbstractC1566 abstractC1566) {
        int i = AbstractC16481.f53441;
        C6041 c6041 = new C6041(0, abstractC1566);
        c6041.mo17866(EnumC1763.SYNTHETIC);
        C17973 c17973M8497 = m8497(c6041);
        C22821.m51449(c17973M8497);
        c17973M8497.m41948(abstractC1566);
        return c6041;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17973 m8497(C6041 c6041) {
        int iM17532 = c6041.m17532();
        int iMax = -1;
        for (C17973 c17973 : this.f8182) {
            if (c17973.m41954() == iM17532) {
                iMax = Math.max(iMax, c17973.m41936());
            }
        }
        return m8496(iM17532, iMax + 1, c6041);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17973 m8496(int i, int i2, C6041 c6041) {
        C17973 c17973 = new C17973(i, i2, c6041);
        if (this.f8182.isEmpty()) {
            this.f8182 = new ArrayList();
        }
        this.f8182.add(c17973);
        return c17973;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8504(C17973 c17973) {
        this.f8182.remove(c17973);
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final List m8490() {
        return this.f8182;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int mo8545() {
        return this.f8172.m26537();
    }

    @Override // l.InterfaceC20451
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10293 mo8547() {
        return this.f8172;
    }

    @Override // l.InterfaceC20451
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8501(C10293 c10293) {
        this.f8172 = c10293;
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final C12050 m8515() {
        return this.f8191;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8503(C12050 c12050) {
        this.f8191 = c12050;
    }

    @Override // l.InterfaceC24181
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1610 mo8527() {
        return this.f8177.mo8527();
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21965 mo8532() {
        return this.f8170;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final C19310 m8533() {
        if (this.f8166) {
            return null;
        }
        return this.f8173.m56078();
    }

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public final void m8553() {
        mo17866(EnumC1763.DONT_GENERATE);
        this.f8166 = true;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final long m8507() {
        C18959[] c18959Arr = this.f8176;
        if (c18959Arr != null) {
            return c18959Arr.length;
        }
        List list = this.f8174;
        if (list != null) {
            return C1170.stream(list).mapToLong(new C9262(0)).sum();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int m8543() {
        return this.f8188;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean mo8510() {
        return this.f8172.m26544();
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C25160 m8523() {
        return this.f8173;
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final List m8514() {
        return this.f8178;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8520(List list) {
        this.f8178 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C2551) it.next()).f8179.add(this);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m8555(List list) {
        this.f8179 = new HashSet(list);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8550(List list) {
        this.f8187 = list;
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C0908 m8511() {
        return this.f8189;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8499(C0908 c0908) {
        this.f8189 = c0908;
    }

    @Override // l.InterfaceC11653
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC1959 mo8493() {
        return EnumC1959.METHOD;
    }

    public final int hashCode() {
        return this.f8170.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2551.class != obj.getClass()) {
            return false;
        }
        return this.f8170.equals(((C2551) obj).f8170);
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֡ */
    public final String mo1790() {
        return C14483.m34974(this) + " (m)";
    }

    public final String toString() {
        return this.f8177 + "." + this.f8170.getName() + '(' + C4123.m13221(this.f8185, ", ") + "):" + this.f8184;
    }
}
