package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.۠۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O8YX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8057 implements InterfaceC8119 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Map f28212;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final LinkedHashSet f28213;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List f28214;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC23601 f28216;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28217;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f28218;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Set f28221;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f28222;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f28223;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f28224;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C21462 f28225;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f28226;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List f28227;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28228;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11647 f28229;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final List f28231;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC1727 f28233;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f28230 = -1;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f28235 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f28215 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f28220 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f28232 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f28219 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22874 f28234 = new C22874(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2432 m21198(String str) {
        int i = 0;
        while (true) {
            int length = str.length();
            int i2 = i;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                break;
            }
            m21190(i, str.substring(i, i2));
            i = i2 + 1;
            if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                i = i2 + 2;
            }
        }
        if (!str.isEmpty() && (i == 0 || i < str.length())) {
            m21190(i, str.substring(i));
        }
        m21189(this.f28228.size());
        InterfaceC14429 interfaceC14429Mo1699 = this.f28233.mo1699(new C16524(this.f28227, this.f28214, this.f28231, this.f28221, this.f28222, this.f28234));
        Iterator it = this.f28217.iterator();
        while (it.hasNext()) {
            ((InterfaceC21524) it.next()).mo19625(interfaceC14429Mo1699);
        }
        return this.f28225.mo1823();
    }

    static {
        int iM51269 = 0;
        Object[] objArr = {C2036.class, C13017.class, C22189.class, C3843.class, C5961.class, AbstractC18661.class, C15134.class};
        ArrayList arrayList = new ArrayList(7);
        while (iM51269 < 7) {
            Object obj = objArr[iM51269];
            iM51269 = C23234.m51269(obj, arrayList, obj, iM51269, 1);
        }
        f28213 = new LinkedHashSet(C0561.unmodifiableList(arrayList));
        HashMap map = new HashMap();
        map.put(C2036.class, new C1000());
        map.put(C13017.class, new C10174());
        map.put(C22189.class, new C19346());
        map.put(C3843.class, new C20757());
        map.put(C5961.class, new C13327());
        map.put(AbstractC18661.class, new C4859());
        map.put(C15134.class, new C20052());
        f28212 = C0561.unmodifiableMap(map);
    }

    public C8057(ArrayList arrayList, InterfaceC1727 interfaceC1727, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashSet hashSet, EnumC23601 enumC23601, int i, int i2) {
        ArrayList arrayList5 = new ArrayList();
        this.f28228 = arrayList5;
        this.f28217 = new ArrayList();
        this.f28224 = arrayList;
        this.f28233 = interfaceC1727;
        this.f28227 = arrayList2;
        this.f28214 = arrayList3;
        this.f28231 = arrayList4;
        this.f28221 = hashSet;
        this.f28216 = enumC23601;
        this.f28223 = i;
        this.f28222 = i2;
        C21462 c21462 = new C21462();
        this.f28225 = c21462;
        arrayList5.add(new C18640(c21462, 0));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static LinkedHashSet m21192() {
        return f28213;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m21188(ArrayList arrayList, LinkedHashSet linkedHashSet) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC17996) f28212.get((Class) it.next()));
        }
        return arrayList2;
    }

    @Override // l.InterfaceC8119
    public final C11647 getLine() {
        return this.f28229;
    }

    @Override // l.InterfaceC8119
    public final int getIndex() {
        return this.f28235;
    }

    @Override // l.InterfaceC8119
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo21197() {
        return this.f28220;
    }

    @Override // l.InterfaceC8119
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo21202() {
        return this.f28215;
    }

    @Override // l.InterfaceC8119
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo21201() {
        return this.f28219;
    }

    @Override // l.InterfaceC8119
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo21199() {
        return this.f28226;
    }

    @Override // l.InterfaceC8119
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21524 mo21200() {
        return ((C18640) C19084.m43861(this.f28228, 1)).f60435;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x014b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21190(int i, String str) {
        ArrayList arrayList;
        C3822 c3822Mo3830;
        List listM50015;
        this.f28230++;
        this.f28235 = 0;
        this.f28215 = 0;
        this.f28218 = false;
        if (str.indexOf(0) != -1) {
            str = str.replace((char) 0, (char) 65533);
        }
        this.f28229 = C11647.m29101(str, this.f28216 != EnumC23601.NONE ? C0316.m1947(this.f28230, 0, i, str.length()) : null);
        int i2 = 1;
        int i3 = 1;
        while (true) {
            arrayList = this.f28228;
            if (i2 >= arrayList.size()) {
                break;
            }
            C18640 c18640 = (C18640) arrayList.get(i2);
            InterfaceC21524 interfaceC21524 = c18640.f60435;
            m21187();
            C22168 c22168Mo1821 = interfaceC21524.mo1821(this);
            if (!C6009.m16315(c22168Mo1821)) {
                break;
            }
            c18640.f60436 = this.f28235;
            if (c22168Mo1821.m49180()) {
                m21186();
                m21189(arrayList.size() - i2);
                return;
            }
            if (c22168Mo1821.m49181() != -1) {
                m21193(c22168Mo1821.m49181());
            } else if (c22168Mo1821.m49179() != -1) {
                m21195(c22168Mo1821.m49179());
            }
            i3++;
            i2++;
        }
        int size = arrayList.size() - i3;
        interfaceC21524 = ((C18640) arrayList.get(i3 - 1)).f60435;
        int i4 = this.f28235;
        boolean zMo8350 = (interfaceC21524.mo1823() instanceof C15840) || interfaceC21524.mo8350();
        boolean z = false;
        while (zMo8350) {
            i4 = this.f28235;
            m21187();
            if (this.f28226 || (this.f28219 < 4 && Character.isLetter(Character.codePointAt(this.f28229.m29102(), this.f28220)))) {
                m21193(this.f28220);
                break;
            }
            if (arrayList.size() > this.f28223) {
                c3822Mo3830 = null;
                break;
            }
            C17934 c17934 = new C17934(interfaceC21524);
            Iterator it = this.f28224.iterator();
            do {
                if (!it.hasNext()) {
                    c3822Mo3830 = null;
                    break;
                }
                c3822Mo3830 = ((InterfaceC17996) it.next()).mo3830(this, c17934);
            } while (!C6009.m16315(c3822Mo3830));
            if (c3822Mo3830 == null) {
                m21193(this.f28220);
                break;
            }
            int i5 = this.f28235;
            if (size > 0) {
                m21189(size);
                size = 0;
            }
            if (c3822Mo3830.m11113() != -1) {
                m21193(c3822Mo3830.m11113());
            } else if (c3822Mo3830.m11115() != -1) {
                m21195(c3822Mo3830.m11115());
            }
            if (c3822Mo3830.m11110() < 1) {
                listM50015 = null;
            } else {
                InterfaceC21524 interfaceC21524Mo21200 = mo21200();
                if (interfaceC21524Mo21200 instanceof C22499) {
                    listM50015 = ((C22499) interfaceC21524Mo21200).m50015(c3822Mo3830.m11110());
                    m21189(1);
                } else {
                    listM50015 = null;
                }
            }
            for (InterfaceC21524 interfaceC21525 : c3822Mo3830.m11112()) {
                m21191(new C18640(interfaceC21525, i5));
                if (listM50015 != null) {
                    interfaceC21525.mo1823().m44384(listM50015);
                }
                zMo8350 = interfaceC21525.mo8350();
            }
            z = true;
        }
        if (!z && !this.f28226 && mo21200().mo28131()) {
            ((C18640) C19084.m43861(arrayList, 1)).f60436 = i4;
            m21196();
            return;
        }
        if (size > 0) {
            m21189(size);
        }
        if (!interfaceC21525.mo8350()) {
            m21196();
        } else if (this.f28226) {
            m21186();
        } else {
            m21191(new C18640(new C22499(), i4));
            m21196();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m21187() {
        int i = this.f28235;
        int i2 = this.f28215;
        this.f28226 = true;
        int length = this.f28229.m29102().length();
        while (i < length) {
            char cCharAt = this.f28229.m29102().charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.f28226 = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f28220 = i;
        this.f28232 = i2;
        this.f28219 = i2 - this.f28215;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m21193(int i) {
        int i2 = this.f28220;
        if (i >= i2) {
            this.f28235 = i2;
            this.f28215 = this.f28232;
        }
        int length = this.f28229.m29102().length();
        while (true) {
            int i3 = this.f28235;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                m21194();
            }
        }
        this.f28218 = false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m21195(int i) {
        int i2;
        int i3 = this.f28232;
        if (i >= i3) {
            this.f28235 = this.f28220;
            this.f28215 = i3;
        }
        int length = this.f28229.m29102().length();
        while (true) {
            i2 = this.f28215;
            if (i2 >= i || this.f28235 == length) {
                break;
            } else {
                m21194();
            }
        }
        if (i2 > i) {
            this.f28235--;
            this.f28215 = i;
            this.f28218 = true;
            return;
        }
        this.f28218 = false;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m21194() {
        char cCharAt = this.f28229.m29102().charAt(this.f28235);
        this.f28235++;
        if (cCharAt == '\t') {
            int i = this.f28215;
            this.f28215 = (4 - (i % 4)) + i;
        } else {
            this.f28215++;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m21196() {
        CharSequence charSequenceSubSequence;
        if (this.f28218) {
            CharSequence charSequenceSubSequence2 = this.f28229.m29102().subSequence(this.f28235 + 1, this.f28229.m29102().length());
            int i = 4 - (this.f28215 % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else if (this.f28235 == 0) {
            charSequenceSubSequence = this.f28229.m29102();
        } else {
            charSequenceSubSequence = this.f28229.m29102().subSequence(this.f28235, this.f28229.m29102().length());
        }
        mo21200().mo1822(C11647.m29101(charSequenceSubSequence, (this.f28216 != EnumC23601.BLOCKS_AND_INLINES || this.f28235 >= this.f28229.m29104().m1952()) ? null : this.f28229.m29104().m1950(this.f28235)));
        m21186();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m21186() {
        if (this.f28216 == EnumC23601.NONE) {
            return;
        }
        int i = 1;
        while (true) {
            ArrayList arrayList = this.f28228;
            if (i >= arrayList.size()) {
                return;
            }
            C18640 c18640 = (C18640) arrayList.get(i);
            int iMin = Math.min(c18640.f60436, this.f28235);
            if (this.f28229.m29102().length() - iMin != 0) {
                c18640.f60435.mo48248(this.f28229.m29104().m1950(iMin));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21191(C18640 c18640) {
        while (!mo21200().mo8349(c18640.f60435.mo1823())) {
            m21189(1);
        }
        mo21200().mo1823().m44388(c18640.f60435.mo1823());
        this.f28228.add(c18640);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21189(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC21524 interfaceC21524 = ((C18640) C17745.m41308(this.f28228, 1)).f60435;
            Iterator it = interfaceC21524.mo48247().iterator();
            while (it.hasNext()) {
                this.f28234.m50618((C11606) it.next());
            }
            interfaceC21524.mo1824();
            this.f28217.add(interfaceC21524);
        }
    }
}
