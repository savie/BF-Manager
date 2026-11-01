package l;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: l.ۘ֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 742G */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3584 implements InterfaceC4290 {
    CLASS_OUTPUT,
    SOURCE_OUTPUT,
    CLASS_PATH,
    SOURCE_PATH,
    ANNOTATION_PROCESSOR_PATH,
    ANNOTATION_PROCESSOR_MODULE_PATH,
    PLATFORM_CLASS_PATH,
    NATIVE_HEADER_OUTPUT,
    MODULE_SOURCE_PATH,
    UPGRADE_MODULE_PATH,
    SYSTEM_MODULES,
    MODULE_PATH,
    PATCH_MODULE_PATH;


    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMap f13186 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4290 m10594(String str) {
        if (f13186.isEmpty()) {
            for (EnumC3584 enumC3584 : values()) {
                f13186.putIfAbsent(enumC3584.getName(), enumC3584);
            }
        }
        str.getClass();
        ConcurrentMap concurrentMap = f13186;
        concurrentMap.putIfAbsent(str, new C12758(str));
        return (InterfaceC4290) concurrentMap.get(str);
    }

    @Override // l.InterfaceC4290
    public String getName() {
        return name();
    }

    @Override // l.InterfaceC4290
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean mo10597() {
        int iOrdinal = ordinal();
        return iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 7;
    }

    @Override // l.InterfaceC4290
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo10596() {
        int iOrdinal = ordinal();
        if (iOrdinal == 5) {
            return true;
        }
        switch (iOrdinal) {
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return true;
            default:
                return false;
        }
    }
}
