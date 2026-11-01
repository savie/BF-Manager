package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7262 extends AbstractC7179 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f24168;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f24169;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f24170;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f24171;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f24172;

    public C7262(C22785 c22785, int i, String str) {
        super(c22785);
        this.f24169 = new ArrayList();
        this.f24172 = new ArrayList();
        this.f24170 = new ArrayList();
        this.f24168 = new ArrayList();
        this.f24171 = new ArrayList();
        this.f23974 = i;
        this.f23976 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19387(String str) {
        this.f23976 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0206 m19392(int i, String str) {
        ArrayList<C0206> arrayList = this.f24172;
        for (C0206 c0206 : arrayList) {
            if (c0206.mo26942() == i) {
                if (c0206.getTypeName().equals(str)) {
                    return c0206;
                }
                throw new RuntimeException(String.format("There is already a type with id of 0x%02x, named \"%s\" not \"%s\"", Integer.valueOf(i), c0206.getTypeName(), str));
            }
        }
        int i2 = i - 1;
        ArrayList arrayList2 = this.f24169;
        if (i2 < arrayList2.size()) {
            arrayList2.set(i2, str);
        } else {
            while (i2 > arrayList2.size()) {
                arrayList2.add("?" + (arrayList2.size() + 1));
            }
            arrayList2.add(str);
        }
        C0206 c0207 = new C0206(this, i);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0206) arrayList.get(size)).mo26942() < i) {
                arrayList.add(size + 1, c0207);
                return c0207;
            }
        }
        arrayList.add(0, c0207);
        return c0207;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0206 m19383() {
        ArrayList<C0206> arrayList = this.f24172;
        for (C0206 c0206 : arrayList) {
            if (c0206.getTypeName().equals(am.aF)) {
                return c0206;
            }
        }
        ArrayList arrayList2 = this.f24169;
        arrayList2.add(am.aF);
        C0206 c0207 = new C0206(this, arrayList2.size());
        arrayList.add(c0207);
        return c0207;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19385(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f24172;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (((C0206) arrayList.get(i2)).mo26942() == i) {
                arrayList.remove(i2);
                ArrayList arrayList2 = this.f24169;
                if (i == arrayList2.size()) {
                    arrayList2.remove(arrayList2.size() - 1);
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            return;
                        }
                        if (!((String) arrayList2.get(size)).equals("?" + (size + 1))) {
                            return;
                        } else {
                            arrayList2.remove(size);
                        }
                    }
                } else {
                    arrayList2.set(i - 1, "?" + i);
                    return;
                }
            } else {
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19386(int i, String str) {
        ArrayList<C7968> arrayList = this.f24170;
        for (C7968 c7968 : arrayList) {
            if (c7968.mo35685() == i) {
                if (!c7968.getPackageName().equals(str)) {
                    throw new RuntimeException(String.format("There is already a library with id of 0x%02x, named \"%s\" not \"%s\"", Integer.valueOf(i), c7968.getPackageName(), str));
                }
                return;
            }
        }
        arrayList.add(new C7968(i, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19257 m19384(String str, String str2) {
        ArrayList<C19257> arrayList = this.f24171;
        for (C19257 c19257 : arrayList) {
            if (c19257.getName().equals(str)) {
                if (c19257.mo35622().equals(str2)) {
                    return c19257;
                }
                throw new RuntimeException(C22697.m50267(C12278.m30515("There is already a overlay with name \"", str, "\", whose actor is \"", c19257.mo35622(), "\" not \""), str2, "\""));
            }
        }
        C19257 c19258 = new C19257(str, str2);
        arrayList.add(c19258);
        return c19258;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C20668 m19391() {
        C20668 c20668 = new C20668();
        this.f24168.add(c20668);
        return c20668;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m19395() {
        this.f24171.clear();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m19390() {
        this.f24168.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19389(InterfaceC16662 interfaceC16662, C8516 c8516, C14319 c14319) {
        for (C23491 c23491 : c14319.f46903) {
            interfaceC16662.mo24505(ColorResourcesTableCreator.HEADER_TYPE_PACKAGE);
            interfaceC16662.mo24505(ColorResourcesTableCreator.PackageChunk.HEADER_SIZE);
            long position = interfaceC16662.getPosition();
            interfaceC16662.mo24500();
            interfaceC16662.writeInt(mo19106());
            interfaceC16662.mo24502(128, getPackageName());
            if (c8516 != null) {
                c8516.m22242(1);
            }
            interfaceC16662.writeInt(288);
            interfaceC16662.writeInt(0);
            long position2 = interfaceC16662.getPosition();
            interfaceC16662.mo24500();
            interfaceC16662.writeInt(0);
            interfaceC16662.writeInt(0);
            C17140 c17140 = new C17140();
            c17140.m40060(true);
            HashSet hashSet = new HashSet();
            ArrayList<C0206> arrayList = c23491.f76057;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(((C0206) it.next()).getTypeName());
            }
            for (C0206 c0206 : arrayList) {
                while (c17140.size() < c0206.mo26942() - 1) {
                    String strM37076 = "?" + (c17140.size() + 1);
                    while (hashSet.contains(strM37076)) {
                        strM37076 = C15489.m37076(strM37076, "?");
                    }
                    c17140.m40063(strM37076);
                }
                c17140.m40063(c0206.getTypeName());
            }
            c17140.m40059(interfaceC16662, false, (C8516) null);
            if (c8516 != null) {
                c8516.m22242(1);
            }
            long position3 = interfaceC16662.getPosition();
            interfaceC16662.seek(position2);
            interfaceC16662.writeInt((int) ((position3 - position) + 4));
            interfaceC16662.seek(position3);
            List<String> list = (List) C9030.stream(arrayList).flatMap(new C14554(1)).filter(new C10085(0)).distinct().collect(C1890.toList());
            C5851 c5851 = new C5851();
            C17140 c17141 = new C17140();
            c17141.m40060(true);
            int i = 0;
            for (String str : list) {
                c17141.m40063(str);
                c5851.put(str, Integer.valueOf(i));
                i++;
            }
            c17141.m40059(interfaceC16662, false, (C8516) null);
            if (c8516 != null) {
                c8516.m22242(1);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C0206) it2.next()).m1527(interfaceC16662, c5851, c8516);
            }
            ArrayList arrayList2 = this.f24170;
            if (arrayList2.size() > 0) {
                interfaceC16662.mo24505((short) 515);
                interfaceC16662.mo24505((short) 12);
                interfaceC16662.writeInt((arrayList2.size() * 260) + 12);
                interfaceC16662.writeInt(arrayList2.size());
                for (C7968 c7968 : m19109()) {
                    interfaceC16662.writeInt(c7968.mo35685());
                    interfaceC16662.mo24502(128, c7968.getPackageName());
                }
            }
            Iterator it3 = c23491.f76058.iterator();
            while (it3.hasNext()) {
                ((C19257) it3.next()).m44201(interfaceC16662);
            }
            Iterator it4 = c23491.f76056.iterator();
            while (it4.hasNext()) {
                ((C20668) it4.next()).m46515(interfaceC16662);
            }
            long position4 = interfaceC16662.getPosition();
            interfaceC16662.seek(position);
            interfaceC16662.writeInt((int) ((position4 - position) + 4));
            interfaceC16662.seek(position4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19388(EnumC10977 enumC10977) {
        if (enumC10977 != this.f23977 && this.f24172.size() != 0) {
            throw new IllegalStateException("Cannot change config layout of populated package");
        }
        C13638.requireNonNull(enumC10977);
        this.f23977 = enumC10977;
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۫ */
    public final int mo7941() {
        return this.f24172.size();
    }

    @Override // l.InterfaceC17721
    public final C0206 getType(int i) {
        return (C0206) this.f24172.get(i);
    }

    @Override // l.AbstractC7179, l.InterfaceC17721
    public final InterfaceC19133 getType(String str) {
        return (C0206) super.getType(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0206 m19394() {
        return (C0206) super.getType("id");
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۟ۙ */
    public final int mo7939() {
        return this.f24170.size();
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC22661 mo7947(int i) {
        return (C7968) this.f24170.get(i);
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ᩵ */
    public final int mo7946() {
        return this.f24171.size();
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC14900 mo7945(int i) {
        return (C19257) this.f24171.get(i);
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۤۙ */
    public final int mo7940() {
        return this.f24168.size();
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC18427 mo7943(int i) {
        return (C20668) this.f24168.get(i);
    }

    @Override // l.InterfaceC17721
    /* JADX INFO: renamed from: ۬ܰ */
    public final List mo7944() {
        return this.f24169;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m19393() {
        Iterator it = m19113().iterator();
        while (it.hasNext()) {
            ((C0206) it.next()).m1541();
        }
    }

    @Override // l.AbstractC7179, l.InterfaceC17721
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6432 mo7938() {
        return (C22785) super.mo7938();
    }
}
