package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7060 extends AbstractC19055 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C4943 f23703;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f23704;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C5109 f23705;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C23289 f23706;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f23707;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f23708;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12000 f23709 = new C12000();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f23710;

    /* JADX INFO: renamed from: ܰ */
    public void mo3206(C23289 c23289) {
        C5109 c5109 = this.f23705;
        c5109.m14226(c5109.m14225() - 1);
        this.f23706.f75537 = this.f23703.mo13724(-1);
        C23289 c232810 = this.f23706;
        if (this.f23708 != null) {
            while (this.f23706 != c23289) {
                m18915();
                this.f23706 = this.f23706.f29378;
            }
        } else {
            this.f23706 = c23289;
        }
        c232810.f29378 = c23289;
        if (!this.f23704 || c23289 == null) {
            return;
        }
        c23289.m51375(c232810);
    }

    @Override // l.AbstractC19055
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo18914(int i) {
        C5109 c5109 = this.f23705;
        return i >= c5109.m14227(c5109.m14225() - 1);
    }

    public AbstractC7060(C4943 c4943) {
        C5109 c5109 = new C5109();
        this.f23705 = c5109;
        c5109.m14224(0);
        this.f23704 = true;
        this.f23703 = null;
        C12000 c12000 = this.f23709;
        c12000.f40219 = false;
        c12000.f40221 = null;
        c12000.f40222 = -1;
        this.f23706 = null;
        this.f23707 = 0;
        this.f23710 = false;
        ArrayList arrayList = this.f23708;
        if (arrayList != null && arrayList.remove((Object) null) && this.f23708.isEmpty()) {
            this.f23708 = null;
        }
        c5109.m14223();
        c5109.m14224(0);
        AbstractC14822 abstractC14822 = this.f61618;
        if (abstractC14822 != null) {
            abstractC14822.mo5172();
        }
        this.f23703 = c4943;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m18919(int i) {
        if (m18920().getType() == i) {
            if (i == -1) {
                this.f23710 = true;
            }
            C12000 c12000 = this.f23709;
            c12000.f40219 = false;
            c12000.f40221 = null;
            c12000.f40222 = -1;
            mo18924();
            return;
        }
        InterfaceC19761 interfaceC19761Mo27094 = this.f23709.mo27094(this);
        if (this.f23704 && interfaceC19761Mo27094.mo22511() == -1) {
            C23289 c23289 = this.f23706;
            C22749 c22749 = new C22749(interfaceC19761Mo27094);
            c23289.getClass();
            c22749.f58966 = c23289;
            c23289.m51375(c22749);
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m18917() {
        this.f23704 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18912(InterfaceC21337 interfaceC21337) {
        if (this.f23708 == null) {
            this.f23708 = new ArrayList();
        }
        this.f23708.add(interfaceC21337);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m18918() {
        Iterator it = this.f23708.iterator();
        while (it.hasNext()) {
            ((InterfaceC21337) it.next()).mo14310(this.f23706);
            this.f23706.getClass();
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m18915() {
        int size = this.f23708.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            InterfaceC21337 interfaceC21337 = (InterfaceC21337) this.f23708.get(size);
            this.f23706.getClass();
            interfaceC21337.mo14309(this.f23706);
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m18916() {
        return this.f23707;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18910(C12000 c12000) {
        this.f23709 = c12000;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19761 m18920() {
        return this.f23703.mo13724(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18911(InterfaceC19761 interfaceC19761, String str, C21877 c21877) {
        this.f23707++;
        m43801().mo11174(this, interfaceC19761, interfaceC19761.getLine(), interfaceC19761.mo22509(), str, c21877);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC19761 mo18924() {
        InterfaceC19761 interfaceC19761M18920 = m18920();
        if (interfaceC19761M18920.getType() != -1) {
            this.f23703.mo11333();
        }
        ArrayList arrayList = this.f23708;
        boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (this.f23704 || z) {
            if (this.f23709.f40219) {
                C23289 c23289 = this.f23706;
                C22749 c22749 = new C22749(interfaceC19761M18920);
                c23289.getClass();
                c22749.f58966 = c23289;
                c23289.m51375(c22749);
                ArrayList arrayList2 = this.f23708;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC21337) it.next()).mo14308(c22749);
                    }
                }
            } else {
                C23289 c232810 = this.f23706;
                C18515 c18515 = new C18515(interfaceC19761M18920);
                c232810.getClass();
                c18515.f58966 = c232810;
                c232810.m51375(c18515);
                ArrayList arrayList3 = this.f23708;
                if (arrayList3 != null) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC21337) it2.next()).mo14307(c18515);
                    }
                }
            }
        }
        return interfaceC19761M18920;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo3204(C23289 c23289, int i, int i2) {
        C23289 c232810;
        C23289 c232811;
        m43806(i);
        this.f23706 = c23289;
        c23289.f75536 = this.f23703.mo13724(1);
        if (this.f23704 && (c232811 = (c232810 = this.f23706).f29378) != null) {
            c232811.m51375(c232810);
        }
        if (this.f23708 != null) {
            m18918();
        }
    }

    /* JADX INFO: renamed from: ܶ */
    public void mo3207() {
        if (this.f23710) {
            this.f23706.f75537 = this.f23703.mo13724(1);
        } else {
            this.f23706.f75537 = this.f23703.mo13724(-1);
        }
        if (this.f23708 != null) {
            m18915();
        }
        m43806(this.f23706.f29377);
        this.f23706 = this.f23706.f29378;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18913(C23289 c23289) {
        C23289 c232810;
        C23289 c232811;
        if (this.f23704 && (c232810 = this.f23706) != c23289 && (c232811 = c232810.f29378) != null) {
            ArrayList arrayList = c232811.f75538;
            if (arrayList != null) {
                C19028.m43762(arrayList, 1);
            }
            c232811.m51375(c23289);
        }
        this.f23706 = c23289;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m18922() {
        C5109 c5109 = this.f23705;
        if (c5109.m14228()) {
            return -1;
        }
        return c5109.m14227(c5109.m14225() - 1);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo3205(C23289 c23289, int i, int i2, int i3) {
        m43806(i);
        this.f23705.m14224(i3);
        this.f23706 = c23289;
        c23289.f75536 = this.f23703.mo13724(1);
        if (this.f23708 != null) {
            m18918();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18909(int i, C23289 c23289) {
        C23289 c232810 = this.f23706;
        c232810.f29378 = c23289;
        c232810.f29377 = i;
        c232810.f75537 = this.f23703.mo13724(-1);
        this.f23706 = c23289;
        c23289.f75536 = c232810.f75536;
        if (this.f23704) {
            c23289.m51375(c232810);
        }
        if (this.f23708 != null) {
            m18918();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23289 m18923() {
        return this.f23706;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0875 m18921() {
        return mo5091().m38340(m43800(), this.f23706);
    }
}
