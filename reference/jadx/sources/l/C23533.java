package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39JX */
/* JADX INFO: loaded from: classes.dex */
public final class C23533 extends C1158 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9601 f76034;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2649 f76032 = new C25025();

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2649 f76031 = new C16819();

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2649 f76033 = new C17565();

    public C23533(C6117 c6117, C8615 c8615, InterfaceC9601 interfaceC9601) {
        super(c6117, c8615);
        this.f76034 = interfaceC9601;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5633 m52731(String str, Set set, EnumSet enumSet, Set set2, EnumC11225 enumC11225, EnumSet enumSet2) {
        C6117 c6117 = new C6117(this.f4280, str);
        try {
            C16073 c16073 = (C16073) this.f76034.mo23731(this.f4277, c6117, new C11598(this, c6117, set, enumSet, set2, enumC11225, enumSet2));
            C13221 c13221 = c16073.f52086;
            C6117 c6118 = c16073.f52087;
            C23533 c23533 = c16073.f52088;
            if (c13221.m32767().contains(EnumC12038.FILE_ATTRIBUTE_DIRECTORY)) {
                return new C13090(c13221.m32766(), c23533, c6118);
            }
            return new C3395(c13221.m32766(), c23533, c6118);
        } catch (C10347 e) {
            throw new C22172(e.m26610().getValue(), EnumC23906.SMB2_CREATE, "Cannot resolve path " + c6117, e);
        }
    }

    @Override // l.C1158
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2649 mo4258() {
        return this.f76034.mo23733();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16073 m52729(C23533 c23533, C6117 c6117, Set set, Set set2, Set set3, EnumC11225 enumC11225, Set set4) {
        C13221 c13221M4262 = c23533.m4262(c6117, set, set2, set3, enumC11225, set4);
        try {
            C16073 c16073 = (C16073) c23533.f76034.mo23732(c23533.f4277, c13221M4262, c6117, new C1904(c23533, c6117, set, set2, set3, enumC11225, set4));
            return c16073 != null ? c16073 : new C16073(c13221M4262, c6117, c23533);
        } catch (C10347 e) {
            throw new C22172(e.m26611(), EnumC23906.SMB2_CREATE, "Cannot resolve path " + c6117, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13090 m52732(String str, EnumSet enumSet, EnumSet enumSet2, Set set, EnumC11225 enumC11225, EnumSet enumSet3) {
        EnumSet enumSetCopyOf = enumSet3 != null ? EnumSet.copyOf((Collection) enumSet3) : EnumSet.noneOf(EnumC23160.class);
        enumSetCopyOf.add(EnumC23160.FILE_DIRECTORY_FILE);
        enumSetCopyOf.remove(EnumC23160.FILE_NON_DIRECTORY_FILE);
        EnumSet enumSetCopyOf2 = enumSet2 != null ? EnumSet.copyOf((Collection) enumSet2) : EnumSet.noneOf(EnumC12038.class);
        enumSetCopyOf2.add(EnumC12038.FILE_ATTRIBUTE_DIRECTORY);
        return (C13090) m52731(str, (Set) enumSet, enumSetCopyOf2, set, enumC11225, enumSetCopyOf);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3395 m52736(String str, EnumSet enumSet, EnumSet enumSet2, Set set, EnumC11225 enumC11225, EnumSet enumSet3) {
        EnumSet enumSetCopyOf = enumSet3 != null ? EnumSet.copyOf((Collection) enumSet3) : EnumSet.noneOf(EnumC23160.class);
        enumSetCopyOf.add(EnumC23160.FILE_NON_DIRECTORY_FILE);
        enumSetCopyOf.remove(EnumC23160.FILE_DIRECTORY_FILE);
        EnumSet enumSetCopyOf2 = enumSet2 != null ? EnumSet.copyOf((Collection) enumSet2) : EnumSet.noneOf(EnumC12038.class);
        enumSetCopyOf2.remove(EnumC12038.FILE_ATTRIBUTE_DIRECTORY);
        return (C3395) m52731(str, (Set) enumSet, enumSetCopyOf2, set, enumC11225, enumSetCopyOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52734(String str) {
        return m52730(str, EnumSet.of(EnumC23160.FILE_NON_DIRECTORY_FILE), f76032);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m52737(String str) {
        return m52730(str, EnumSet.of(EnumC23160.FILE_DIRECTORY_FILE), f76031);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m52730(String str, EnumSet enumSet, InterfaceC2649 interfaceC2649) {
        try {
            m52731(str, (Set) EnumSet.of(EnumC15767.FILE_READ_ATTRIBUTES), EnumSet.of(EnumC12038.FILE_ATTRIBUTE_NORMAL), EnumC0785.f2811, EnumC11225.FILE_OPEN, enumSet).close();
            return true;
        } catch (C22172 e) {
            if (interfaceC2649.mo2217(e.m50141())) {
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList m52738(String str) {
        C13090 c13090M52732 = m52732(str, EnumSet.of(EnumC15767.FILE_LIST_DIRECTORY, EnumC15767.FILE_READ_ATTRIBUTES, EnumC15767.FILE_READ_EA), (EnumSet) null, EnumC0785.f2811, EnumC11225.FILE_OPEN, (EnumSet) null);
        C25398 c25398 = c13090M52732.f19480;
        C23533 c23533 = c13090M52732.f19479;
        C6117 c6117 = c13090M52732.f19481;
        InterfaceC25186 interfaceC25186 = c13090M52732.f19482;
        try {
            ArrayList arrayList = new ArrayList();
            C15327 c15327 = new C15327(c13090M52732);
            while (c15327.hasNext()) {
                arrayList.add((AbstractC7564) c15327.next());
            }
            try {
                c13090M52732.close();
                return arrayList;
            } catch (Exception e) {
                interfaceC25186.mo13703("{} close failed for {},{},{}", "Directory", c6117, c23533, c25398, e);
                return arrayList;
            }
        } catch (Throwable th) {
            try {
                c13090M52732.close();
                throw th;
            } catch (Exception e2) {
                interfaceC25186.mo13703("{} close failed for {},{},{}", "Directory", c6117, c23533, c25398, e2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52733(String str, boolean z) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("rmdir: path should be non-null and non-empty");
        }
        try {
            if (z) {
                for (C9055 c9055 : m52738(str)) {
                    if (!c9055.m20655().equals(".") && !c9055.m20655().equals("..")) {
                        String str2 = str + "\\" + c9055.m20655();
                        if (!C10961.m27794(c9055.m24192(), EnumC12038.FILE_ATTRIBUTE_DIRECTORY)) {
                            m52735(str2);
                        } else {
                            m52733(str2, true);
                        }
                    }
                }
                m52733(str, false);
                return;
            }
            AbstractC5633 abstractC5633M52731 = m52731(str, (Set) EnumSet.of(EnumC15767.DELETE), EnumSet.of(EnumC12038.FILE_ATTRIBUTE_DIRECTORY), (Set) EnumSet.of(EnumC0785.FILE_SHARE_DELETE, EnumC0785.FILE_SHARE_WRITE, EnumC0785.FILE_SHARE_READ), EnumC11225.FILE_OPEN, EnumSet.of(EnumC23160.FILE_DIRECTORY_FILE));
            try {
                C23533 c23533 = abstractC5633M52731.f19479;
                C25398 c25398 = abstractC5633M52731.f19480;
                c23533.getClass();
                C18751 c18751 = new C18751();
                C7453 c7453 = new C7453();
                InterfaceC6819 interfaceC6819M48447 = C21273.m48447(c18751);
                interfaceC6819M48447.mo11074(c18751, c7453);
                c23533.m4264(c25398, EnumC0543.SMB2_0_INFO_FILE, interfaceC6819M48447.mo6458(), c7453.m56028());
                abstractC5633M52731.close();
            } catch (Throwable th) {
                try {
                    abstractC5633M52731.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C22172 e) {
            if (!((C17565) f76033).mo2217(e.m50141())) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m52735(String str) {
        try {
            AbstractC5633 abstractC5633M52731 = m52731(str, (Set) EnumSet.of(EnumC15767.DELETE), EnumSet.of(EnumC12038.FILE_ATTRIBUTE_NORMAL), (Set) EnumSet.of(EnumC0785.FILE_SHARE_DELETE, EnumC0785.FILE_SHARE_WRITE, EnumC0785.FILE_SHARE_READ), EnumC11225.FILE_OPEN, EnumSet.of(EnumC23160.FILE_NON_DIRECTORY_FILE));
            try {
                C23533 c23533 = abstractC5633M52731.f19479;
                C25398 c25398 = abstractC5633M52731.f19480;
                c23533.getClass();
                C18751 c18751 = new C18751();
                C7453 c7453 = new C7453();
                InterfaceC6819 interfaceC6819M48447 = C21273.m48447(c18751);
                interfaceC6819M48447.mo11074(c18751, c7453);
                c23533.m4264(c25398, EnumC0543.SMB2_0_INFO_FILE, interfaceC6819M48447.mo6458(), c7453.m56028());
                abstractC5633M52731.close();
            } catch (Throwable th) {
                try {
                    abstractC5633M52731.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C22172 e) {
            if (!((C17565) f76033).mo2217(e.m50141())) {
                throw e;
            }
        }
    }

    public final String toString() {
        return "DiskShare[" + this.f4280 + "]";
    }
}
