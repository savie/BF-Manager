package l;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98TD */
/* JADX INFO: loaded from: classes4.dex */
public final class C16680 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC24886 f53885;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4879 f53888;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC4639 f53889;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f53893;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC22230 f53895;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20738 f53896;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC19764 f53892 = new C22748();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f53891 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashMap f53890 = new HashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53887 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f53886 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f53894 = new HashSet();

    public C16680(InterfaceC24886 interfaceC24886, InterfaceC22230 interfaceC22230, InterfaceC4879 interfaceC4879, C20738 c20738) {
        this.f53896 = c20738;
        this.f53885 = interfaceC24886;
        this.f53895 = interfaceC22230;
        this.f53888 = interfaceC4879;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC24755 m39436(List list, InterfaceC19764 interfaceC19764) {
        ArrayList arrayList = this.f53887;
        m39424(0, arrayList.size());
        return m39435(arrayList.size(), list, interfaceC19764);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC24755 m39435(int i, List list, InterfaceC19764 interfaceC19764) {
        if (!list.isEmpty()) {
            this.f53892 = interfaceC19764;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C11459 c11459 = (C11459) list.get(i2 - i);
                ArrayList arrayList = this.f53887;
                if (i2 > 0) {
                    C11459 c114510 = (C11459) arrayList.get(i2 - 1);
                    c11459.f36041 = c114510.f36042.m43739().mo16022() + c114510.f36041;
                } else {
                    c11459.f36041 = 0;
                }
                c11459.f36039 = false;
                c11459.f36038.clear();
                int iMo16022 = c11459.f36042.m43739().mo16022();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((C11459) arrayList.get(i3)).f36041 += iMo16022;
                }
                arrayList.add(i2, c11459);
                this.f53890.put(c11459.f36040, c11459);
                if (this.f53893) {
                    m39430(c11459);
                    if (this.f53891.isEmpty()) {
                        this.f53894.add(c11459);
                    } else {
                        C1765 c1765 = (C1765) this.f53886.get(c11459);
                        if (c1765 != null) {
                            c1765.f6069.mo24730(c1765.f6068);
                        }
                    }
                }
            }
        }
        return m39432();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC24755 m39433(int i, int i2, List list) {
        ArrayList arrayList = this.f53887;
        C20782.m47565(i >= 0 && i <= i2 && i2 <= arrayList.size());
        C20782.m47565(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((C11459) arrayList.get(i3)).f36042.mo24727((C14902) list.get(i3 - i));
        }
        return m39432();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m39444() {
        return this.f53893;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC24755 m39434(int i, int i2, InterfaceC19764 interfaceC19764) {
        C20782.m47565(i >= 0 && i <= i2 && i2 <= this.f53887.size());
        this.f53892 = interfaceC19764;
        m39424(i, i2);
        return m39432();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC24755 m39437(InterfaceC19764 interfaceC19764) {
        int size = this.f53887.size();
        if (interfaceC19764.getLength() != size) {
            interfaceC19764 = interfaceC19764.mo45526().mo45527(size);
        }
        this.f53892 = interfaceC19764;
        return m39432();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m39440() {
        return this.f53887.size();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC24755 m39442() {
        C20782.m47565(this.f53887.size() >= 0);
        this.f53892 = null;
        return m39432();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39438(InterfaceC4639 interfaceC4639) {
        C20782.m47568(!this.f53893);
        this.f53889 = interfaceC4639;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f53887;
            if (i < arrayList.size()) {
                C11459 c11459 = (C11459) arrayList.get(i);
                m39430(c11459);
                this.f53894.add(c11459);
                i++;
            } else {
                this.f53893 = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18098 m39431(C8402 c8402, InterfaceC13314 interfaceC13314, long j) {
        Object obj = c8402.f27520;
        int i = AbstractC5142.f17910;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        C8402 c8402M22580 = c8402.m22580(pair.second);
        C11459 c11459 = (C11459) this.f53890.get(obj2);
        c11459.getClass();
        this.f53894.add(c11459);
        C1765 c1765 = (C1765) this.f53886.get(c11459);
        if (c1765 != null) {
            c1765.f6069.mo24724(c1765.f6068);
        }
        c11459.f36038.add(c8402M22580);
        C18098 c18098Mo33371 = c11459.f36042.mo33371(c8402M22580, interfaceC13314, j);
        this.f53891.put(c18098Mo33371, c11459);
        m39428();
        return c18098Mo33371;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39439(InterfaceC9147 interfaceC9147) {
        IdentityHashMap identityHashMap = this.f53891;
        C11459 c11459 = (C11459) identityHashMap.remove(interfaceC9147);
        c11459.getClass();
        c11459.f36042.mo33372(interfaceC9147);
        c11459.f36038.remove(((C18098) interfaceC9147).f59231);
        if (!identityHashMap.isEmpty()) {
            m39428();
        }
        m39425(c11459);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m39441() {
        HashMap map = this.f53886;
        for (C1765 c1765 : map.values()) {
            try {
                c1765.f6069.mo24735(c1765.f6068);
            } catch (RuntimeException e) {
                C1896.m6516("Failed to release child source.", e);
            }
            InterfaceC13622 interfaceC13622 = c1765.f6069;
            C5494 c5494 = c1765.f6070;
            interfaceC13622.mo24726((InterfaceC13380) c5494);
            c1765.f6069.mo24723((InterfaceC5537) c5494);
        }
        map.clear();
        this.f53894.clear();
        this.f53893 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC24755 m39432() {
        ArrayList arrayList = this.f53887;
        if (arrayList.isEmpty()) {
            return AbstractC24755.f80138;
        }
        int iMo16022 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            C11459 c11459 = (C11459) arrayList.get(i);
            c11459.f36041 = iMo16022;
            iMo16022 += c11459.f36042.m43739().mo16022();
        }
        return new C6240(arrayList, this.f53892);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC19764 m39443() {
        return this.f53892;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m39428() {
        Iterator it = this.f53894.iterator();
        while (it.hasNext()) {
            C11459 c11459 = (C11459) it.next();
            if (c11459.f36038.isEmpty()) {
                C1765 c1765 = (C1765) this.f53886.get(c11459);
                if (c1765 != null) {
                    c1765.f6069.mo24730(c1765.f6068);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39424(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.f53887;
            C11459 c11459 = (C11459) arrayList.remove(i3);
            this.f53890.remove(c11459.f36040);
            int i4 = -c11459.f36042.m43739().mo16022();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((C11459) arrayList.get(i5)).f36041 += i4;
            }
            c11459.f36039 = true;
            if (this.f53893) {
                m39425(c11459);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ۜۙ᩷, l.ۡ֡ۙ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m39430(C11459 c11459) {
        C18844 c18844 = c11459.f36042;
        ?? r1 = new InterfaceC6911() { // from class: l.ۡ֡ۙ
            @Override // l.InterfaceC6911
            /* JADX INFO: renamed from: ۙ */
            public final void mo19189(AbstractC9395 abstractC9395, AbstractC24755 abstractC24755) {
                ((C11240) this.f29319.f53885).m28464();
            }
        };
        C5494 c5494 = new C5494(this, c11459);
        this.f53886.put(c11459, new C1765(c18844, r1, c5494));
        String str = C7116.f23455;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        c18844.mo24722(new Handler(looperMyLooper, null), (InterfaceC13380) c5494);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        c18844.mo24721(new Handler(looperMyLooper2, null), (InterfaceC5537) c5494);
        c18844.mo24725((InterfaceC6911) r1, this.f53889, this.f53896);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39425(C11459 c11459) {
        if (c11459.f36039 && c11459.f36038.isEmpty()) {
            C1765 c1765 = (C1765) this.f53886.remove(c11459);
            c1765.getClass();
            C5494 c5494 = c1765.f6070;
            InterfaceC13622 interfaceC13622 = c1765.f6069;
            interfaceC13622.mo24735(c1765.f6068);
            interfaceC13622.mo24726((InterfaceC13380) c5494);
            interfaceC13622.mo24723((InterfaceC5537) c5494);
            this.f53894.remove(c11459);
        }
    }
}
