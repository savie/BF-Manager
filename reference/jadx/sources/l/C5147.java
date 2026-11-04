package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8YX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5147 implements InterfaceC4753 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Map f17923;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final LinkedHashSet f17924;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC15720 f17925;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Set f17926;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17928;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C8677 f17929;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f17930;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f17931;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f17933;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List f17934;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17935;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C14228 f17937;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f17938;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3042 f17939;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f17940;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final List f17941;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f17942;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f17944 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f17946 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f17943 = 0;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f17945 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f17927 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f17932 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20354 f17936 = new C20354(1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14753 m15558(String str) {
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
            m15550(i, str.substring(i, i2));
            i = i2 + 1;
            if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                i = i2 + 2;
            }
        }
        if (!str.isEmpty() && (i == 0 || i < str.length())) {
            m15550(i, str.substring(i));
        }
        m15549(this.f17935.size());
        InterfaceC23180 interfaceC23180Mo9894 = this.f17939.mo9894(new C11858(this.f17938, this.f17934, this.f17941, this.f17926, this.f17933, this.f17936));
        Iterator it = this.f17928.iterator();
        while (it.hasNext()) {
            ((InterfaceC8263) it.next()).mo22277(interfaceC23180Mo9894);
        }
        return this.f17929.mo7447();
    }

    static {
        int iM9136 = 0;
        Object[] objArr = {C3567.class, C8042.class, C18483.class, C19229.class, C16466.class, AbstractC7296.class, C9532.class};
        ArrayList arrayList = new ArrayList(7);
        while (iM9136 < 7) {
            Object obj = objArr[iM9136];
            iM9136 = C2764.m9136(obj, arrayList, obj, iM9136, 1);
        }
        f17924 = new LinkedHashSet(C4681.unmodifiableList(arrayList));
        HashMap map = new HashMap();
        map.put(C3567.class, new C19119());
        map.put(C8042.class, new C23047());
        map.put(C18483.class, new C22301());
        map.put(C19229.class, new C15587());
        map.put(C16466.class, new C8130());
        map.put(AbstractC7296.class, new C6639());
        map.put(C9532.class, new C5893());
        f17923 = C4681.unmodifiableMap(map);
    }

    public C5147(ArrayList arrayList, InterfaceC3042 interfaceC3042, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashSet hashSet, EnumC15720 enumC15720, int i, int i2) {
        ArrayList arrayList5 = new ArrayList();
        this.f17935 = arrayList5;
        this.f17928 = new ArrayList();
        this.f17931 = arrayList;
        this.f17939 = interfaceC3042;
        this.f17938 = arrayList2;
        this.f17934 = arrayList3;
        this.f17941 = arrayList4;
        this.f17926 = hashSet;
        this.f17925 = enumC15720;
        this.f17930 = i;
        this.f17933 = i2;
        C8677 c8677 = new C8677();
        this.f17929 = c8677;
        arrayList5.add(new C13897(c8677, 0));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static LinkedHashSet m15554() {
        return f17924;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m15548(ArrayList arrayList, LinkedHashSet linkedHashSet) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC6772) f17923.get((Class) it.next()));
        }
        return arrayList2;
    }

    @Override // l.InterfaceC4753
    public final C14228 getLine() {
        return this.f17937;
    }

    @Override // l.InterfaceC4753
    public final int getIndex() {
        return this.f17946;
    }

    @Override // l.InterfaceC4753
    /* JADX INFO: renamed from: ᩸ */
    public final int mo14654() {
        return this.f17945;
    }

    @Override // l.InterfaceC4753
    /* JADX INFO: renamed from: ۤ */
    public final int mo14651() {
        return this.f17943;
    }

    @Override // l.InterfaceC4753
    /* JADX INFO: renamed from: ۙ */
    public final int mo14650() {
        return this.f17932;
    }

    @Override // l.InterfaceC4753
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo14653() {
        return this.f17942;
    }

    @Override // l.InterfaceC4753
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC8263 mo14652() {
        return ((C13897) j$$ExternalSyntheticOutline0.m(this.f17935, 1)).f44066;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x014b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15550(int i, String str) {
        ArrayList arrayList;
        C1220 c1220Mo13215;
        List listM43147;
        this.f17944++;
        this.f17946 = 0;
        this.f17943 = 0;
        this.f17940 = false;
        if (str.indexOf(0) != -1) {
            str = str.replace((char) 0, (char) 65533);
        }
        this.f17937 = C14228.m34536(str, this.f17925 != EnumC15720.NONE ? C5280.m15866(this.f17944, 0, i, str.length()) : null);
        int i2 = 1;
        int i3 = 1;
        while (true) {
            arrayList = this.f17935;
            if (i2 >= arrayList.size()) {
                break;
            }
            C13897 c13897 = (C13897) arrayList.get(i2);
            InterfaceC8263 interfaceC8263 = c13897.f44066;
            m15547();
            C7932 c7932Mo7444 = interfaceC8263.mo7444(this);
            if (!C1402.m5130(c7932Mo7444)) {
                break;
            }
            c13897.f44067 = this.f17946;
            if (c7932Mo7444.m21506()) {
                m15555();
                m15549(arrayList.size() - i2);
                return;
            }
            if (c7932Mo7444.m21507() != -1) {
                m15553(c7932Mo7444.m21507());
            } else if (c7932Mo7444.m21505() != -1) {
                m15557(c7932Mo7444.m21505());
            }
            i3++;
            i2++;
        }
        int size = arrayList.size() - i3;
        interfaceC8263 = ((C13897) arrayList.get(i3 - 1)).f44066;
        int i4 = this.f17946;
        boolean zMo22280 = (interfaceC8263.mo7447() instanceof C14974) || interfaceC8263.mo22280();
        boolean z = false;
        while (zMo22280) {
            i4 = this.f17946;
            m15547();
            if (this.f17942 || (this.f17932 < 4 && Character.isLetter(Character.codePointAt(this.f17937.m34537(), this.f17945)))) {
                m15553(this.f17945);
                break;
            }
            if (arrayList.size() > this.f17930) {
                c1220Mo13215 = null;
                break;
            }
            C7186 c7186 = new C7186(interfaceC8263);
            Iterator it = this.f17931.iterator();
            do {
                if (!it.hasNext()) {
                    c1220Mo13215 = null;
                    break;
                }
                c1220Mo13215 = ((InterfaceC6772) it.next()).mo13215(this, c7186);
            } while (!C1402.m5130(c1220Mo13215));
            if (c1220Mo13215 == null) {
                m15553(this.f17945);
                break;
            }
            int i5 = this.f17946;
            if (size > 0) {
                m15549(size);
                size = 0;
            }
            if (c1220Mo13215.m4437() != -1) {
                m15553(c1220Mo13215.m4437());
            } else if (c1220Mo13215.m4439() != -1) {
                m15557(c1220Mo13215.m4439());
            }
            if (c1220Mo13215.m4441() < 1) {
                listM43147 = null;
            } else {
                InterfaceC8263 interfaceC8263Mo14652 = mo14652();
                if (interfaceC8263Mo14652 instanceof C18571) {
                    listM43147 = ((C18571) interfaceC8263Mo14652).m43147(c1220Mo13215.m4441());
                    m15549(1);
                } else {
                    listM43147 = null;
                }
            }
            for (InterfaceC8263 interfaceC8264 : c1220Mo13215.m4436()) {
                m15551(new C13897(interfaceC8264, i5));
                if (listM43147 != null) {
                    interfaceC8264.mo7447().m14255(listM43147);
                }
                zMo22280 = interfaceC8264.mo22280();
            }
            z = true;
        }
        if (!z && !this.f17942 && mo14652().mo22279()) {
            ((C13897) j$$ExternalSyntheticOutline0.m(arrayList, 1)).f44067 = i4;
            m15556();
            return;
        }
        if (size > 0) {
            m15549(size);
        }
        if (!interfaceC8264.mo22280()) {
            m15556();
        } else if (this.f17942) {
            m15555();
        } else {
            m15551(new C13897(new C18571(), i4));
            m15556();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15547() {
        int i = this.f17946;
        int i2 = this.f17943;
        this.f17942 = true;
        int length = this.f17937.m34537().length();
        while (i < length) {
            char cCharAt = this.f17937.m34537().charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.f17942 = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f17945 = i;
        this.f17927 = i2;
        this.f17932 = i2 - this.f17943;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m15553(int i) {
        int i2 = this.f17945;
        if (i >= i2) {
            this.f17946 = i2;
            this.f17943 = this.f17927;
        }
        int length = this.f17937.m34537().length();
        while (true) {
            int i3 = this.f17946;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                m15552();
            }
        }
        this.f17940 = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m15557(int i) {
        int i2;
        int i3 = this.f17927;
        if (i >= i3) {
            this.f17946 = this.f17945;
            this.f17943 = i3;
        }
        int length = this.f17937.m34537().length();
        while (true) {
            i2 = this.f17943;
            if (i2 >= i || this.f17946 == length) {
                break;
            } else {
                m15552();
            }
        }
        if (i2 > i) {
            this.f17946--;
            this.f17943 = i;
            this.f17940 = true;
            return;
        }
        this.f17940 = false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m15552() {
        char cCharAt = this.f17937.m34537().charAt(this.f17946);
        this.f17946++;
        if (cCharAt == '\t') {
            int i = this.f17943;
            this.f17943 = (4 - (i % 4)) + i;
        } else {
            this.f17943++;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m15556() {
        CharSequence charSequenceSubSequence;
        if (this.f17940) {
            CharSequence charSequenceSubSequence2 = this.f17937.m34537().subSequence(this.f17946 + 1, this.f17937.m34537().length());
            int i = 4 - (this.f17943 % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else if (this.f17946 == 0) {
            charSequenceSubSequence = this.f17937.m34537();
        } else {
            charSequenceSubSequence = this.f17937.m34537().subSequence(this.f17946, this.f17937.m34537().length());
        }
        mo14652().mo7445(C14228.m34536(charSequenceSubSequence, (this.f17925 != EnumC15720.BLOCKS_AND_INLINES || this.f17946 >= this.f17937.m34539().m15870()) ? null : this.f17937.m34539().m15868(this.f17946)));
        m15555();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m15555() {
        if (this.f17925 == EnumC15720.NONE) {
            return;
        }
        int i = 1;
        while (true) {
            ArrayList arrayList = this.f17935;
            if (i >= arrayList.size()) {
                return;
            }
            C13897 c13897 = (C13897) arrayList.get(i);
            int iMin = Math.min(c13897.f44067, this.f17946);
            if (this.f17937.m34537().length() - iMin != 0) {
                c13897.f44066.mo22276(this.f17937.m34539().m15868(iMin));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15551(C13897 c13897) {
        while (!mo14652().mo22278(c13897.f44066.mo7447())) {
            m15549(1);
        }
        mo14652().mo7447().m14256(c13897.f44066.mo7447());
        this.f17935.add(c13897);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15549(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC8263 interfaceC8263 = ((C13897) C18011.m41990(this.f17935, 1)).f44066;
            Iterator it = interfaceC8263.mo22275().iterator();
            while (it.hasNext()) {
                this.f17936.m46772((C4313) it.next());
            }
            interfaceC8263.mo7446();
            this.f17928.add(interfaceC8263);
        }
    }
}
