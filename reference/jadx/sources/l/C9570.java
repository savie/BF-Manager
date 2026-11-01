package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39JX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9570 extends C21294 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18472 f32278 = new C10981();

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18472 f32279 = new C23681();

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC18472 f32280 = new C14509();

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18035 f32281;

    public C9570(C11748 c11748, C7889 c7889, InterfaceC18035 interfaceC18035) {
        super(c11748, c7889);
        this.f32281 = interfaceC18035;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12392 m24428(String str, Set set, EnumSet enumSet, Set set2, EnumC7808 enumC7808, EnumSet enumSet2) {
        C11748 c11748 = new C11748(this.f69296, str);
        try {
            C1807 c1807 = (C1807) this.f32281.mo21469(this.f69299, c11748, new C6041(this, c11748, set, enumSet, set2, enumC7808, enumSet2));
            C0481 c0481 = c1807.f6961;
            C11748 c11749 = c1807.f6962;
            C9570 c9570 = c1807.f6963;
            if (c0481.m2355().contains(EnumC4611.FILE_ATTRIBUTE_DIRECTORY)) {
                return new C16625(c0481.m2354(), c9570, c11749);
            }
            return new C3218(c0481.m2354(), c9570, c11749);
        } catch (C15214 e) {
            throw new C10360(e.m36419().getValue(), EnumC2162.SMB2_CREATE, "Cannot resolve path " + c11748, e);
        }
    }

    @Override // l.C21294
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18472 mo24430() {
        return this.f32281.mo21471();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1807 m24425(C9570 c9570, C11748 c11748, Set set, Set set2, Set set3, EnumC7808 enumC7808, Set set4) {
        C0481 c0481M47746 = c9570.m47746(c11748, set, set2, set3, enumC7808, set4);
        try {
            C1807 c1807 = (C1807) c9570.f32281.mo21470(c9570.f69299, c0481M47746, c11748, new C17330(c9570, c11748, set, set2, set3, enumC7808, set4));
            return c1807 != null ? c1807 : new C1807(c0481M47746, c11748, c9570);
        } catch (C15214 e) {
            throw new C10360(e.m36420(), EnumC2162.SMB2_CREATE, "Cannot resolve path " + c11748, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16625 m24429(String str, EnumSet enumSet, EnumSet enumSet2, Set set, EnumC7808 enumC7808, EnumSet enumSet3) {
        EnumSet enumSetCopyOf = enumSet3 != null ? EnumSet.copyOf((Collection) enumSet3) : EnumSet.noneOf(EnumC21213.class);
        enumSetCopyOf.add(EnumC21213.FILE_DIRECTORY_FILE);
        enumSetCopyOf.remove(EnumC21213.FILE_NON_DIRECTORY_FILE);
        EnumSet enumSetCopyOf2 = enumSet2 != null ? EnumSet.copyOf((Collection) enumSet2) : EnumSet.noneOf(EnumC4611.class);
        enumSetCopyOf2.add(EnumC4611.FILE_ATTRIBUTE_DIRECTORY);
        return (C16625) m24428(str, (Set) enumSet, enumSetCopyOf2, set, enumC7808, enumSetCopyOf);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3218 m24434(String str, EnumSet enumSet, EnumSet enumSet2, Set set, EnumC7808 enumC7808, EnumSet enumSet3) {
        EnumSet enumSetCopyOf = enumSet3 != null ? EnumSet.copyOf((Collection) enumSet3) : EnumSet.noneOf(EnumC21213.class);
        enumSetCopyOf.add(EnumC21213.FILE_NON_DIRECTORY_FILE);
        enumSetCopyOf.remove(EnumC21213.FILE_DIRECTORY_FILE);
        EnumSet enumSetCopyOf2 = enumSet2 != null ? EnumSet.copyOf((Collection) enumSet2) : EnumSet.noneOf(EnumC4611.class);
        enumSetCopyOf2.remove(EnumC4611.FILE_ATTRIBUTE_DIRECTORY);
        return (C3218) m24428(str, (Set) enumSet, enumSetCopyOf2, set, enumC7808, enumSetCopyOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24432(String str) {
        return m24426(str, EnumSet.of(EnumC21213.FILE_NON_DIRECTORY_FILE), f32278);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m24435(String str) {
        return m24426(str, EnumSet.of(EnumC21213.FILE_DIRECTORY_FILE), f32279);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m24426(String str, EnumSet enumSet, InterfaceC18472 interfaceC18472) {
        try {
            m24428(str, (Set) EnumSet.of(EnumC14346.FILE_READ_ATTRIBUTES), EnumSet.of(EnumC4611.FILE_ATTRIBUTE_NORMAL), EnumC13182.f43879, EnumC7808.FILE_OPEN, enumSet).close();
            return true;
        } catch (C10360 e) {
            if (interfaceC18472.mo10768(e.m26258())) {
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList m24427(String str) {
        C16625 c16625M24429 = m24429(str, EnumSet.of(EnumC14346.FILE_LIST_DIRECTORY, EnumC14346.FILE_READ_ATTRIBUTES, EnumC14346.FILE_READ_EA), (EnumSet) null, EnumC13182.f43879, EnumC7808.FILE_OPEN, (EnumSet) null);
        C6396 c6396 = c16625M24429.f41412;
        C9570 c9570 = c16625M24429.f41413;
        C11748 c11748 = c16625M24429.f41411;
        InterfaceC4314 interfaceC4314 = c16625M24429.f41414;
        try {
            ArrayList arrayList = new ArrayList();
            C0396 c0396 = new C0396(c16625M24429);
            while (c0396.hasNext()) {
                arrayList.add((AbstractC3905) c0396.next());
            }
            try {
                c16625M24429.close();
                return arrayList;
            } catch (Exception e) {
                interfaceC4314.mo12123("{} close failed for {},{},{}", "Directory", c11748, c9570, c6396, e);
                return arrayList;
            }
        } catch (Throwable th) {
            try {
                c16625M24429.close();
                throw th;
            } catch (Exception e2) {
                interfaceC4314.mo12123("{} close failed for {},{},{}", "Directory", c11748, c9570, c6396, e2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24431(String str, boolean z) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("rmdir: path should be non-null and non-empty");
        }
        try {
            if (z) {
                for (C21545 c21545 : m24427(str)) {
                    if (!c21545.m11356().equals(".") && !c21545.m11356().equals("..")) {
                        String str2 = str + "\\" + c21545.m11356();
                        if (!C20799.m46784(c21545.m48265(), EnumC4611.FILE_ATTRIBUTE_DIRECTORY)) {
                            m24433(str2);
                        } else {
                            m24431(str2, true);
                        }
                    }
                }
                m24431(str, false);
                return;
            }
            AbstractC12392 abstractC12392M24428 = m24428(str, (Set) EnumSet.of(EnumC14346.DELETE), EnumSet.of(EnumC4611.FILE_ATTRIBUTE_DIRECTORY), (Set) EnumSet.of(EnumC13182.FILE_SHARE_DELETE, EnumC13182.FILE_SHARE_WRITE, EnumC13182.FILE_SHARE_READ), EnumC7808.FILE_OPEN, EnumSet.of(EnumC21213.FILE_DIRECTORY_FILE));
            try {
                C9570 c9570 = abstractC12392M24428.f41413;
                C6396 c6396 = abstractC12392M24428.f41412;
                c9570.getClass();
                C6728 c6728 = new C6728();
                C19240 c19240 = new C19240();
                InterfaceC8140 interfaceC8140M50147 = C22625.m50147(c6728);
                interfaceC8140M50147.mo8636(c6728, c19240);
                c9570.m47750(c6396, EnumC12810.SMB2_0_INFO_FILE, interfaceC8140M50147.mo8635(), c19240.m27377());
                abstractC12392M24428.close();
            } catch (Throwable th) {
                try {
                    abstractC12392M24428.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C10360 e) {
            if (!((C14509) f32280).mo10768(e.m26258())) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m24433(String str) {
        try {
            AbstractC12392 abstractC12392M24428 = m24428(str, (Set) EnumSet.of(EnumC14346.DELETE), EnumSet.of(EnumC4611.FILE_ATTRIBUTE_NORMAL), (Set) EnumSet.of(EnumC13182.FILE_SHARE_DELETE, EnumC13182.FILE_SHARE_WRITE, EnumC13182.FILE_SHARE_READ), EnumC7808.FILE_OPEN, EnumSet.of(EnumC21213.FILE_NON_DIRECTORY_FILE));
            try {
                C9570 c9570 = abstractC12392M24428.f41413;
                C6396 c6396 = abstractC12392M24428.f41412;
                c9570.getClass();
                C6728 c6728 = new C6728();
                C19240 c19240 = new C19240();
                InterfaceC8140 interfaceC8140M50147 = C22625.m50147(c6728);
                interfaceC8140M50147.mo8636(c6728, c19240);
                c9570.m47750(c6396, EnumC12810.SMB2_0_INFO_FILE, interfaceC8140M50147.mo8635(), c19240.m27377());
                abstractC12392M24428.close();
            } catch (Throwable th) {
                try {
                    abstractC12392M24428.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C10360 e) {
            if (!((C14509) f32280).mo10768(e.m26258())) {
                throw e;
            }
        }
    }

    public final String toString() {
        return "DiskShare[" + this.f69296 + "]";
    }
}
