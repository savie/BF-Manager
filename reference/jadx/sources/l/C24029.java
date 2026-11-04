package l;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: TIYM */
/* JADX INFO: loaded from: classes.dex */
public final class C24029 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f77745 = C16980.m40037(C24029.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53586(C0162 c0162) {
        C6129 c6129M1365 = c0162.m1365();
        ArrayList<File> arrayListM17723 = c6129M1365.m17723();
        if (arrayListM17723.isEmpty() && c0162.m1371().isEmpty()) {
            throw new C1140("Please specify input file");
        }
        for (File file : arrayListM17723) {
            if (file.getName().startsWith("--")) {
                throw new C1140("Unknown argument: " + file.getName());
            }
        }
        for (File file2 : arrayListM17723) {
            if (!file2.exists()) {
                throw new C1140("File not found " + file2.getAbsolutePath());
            }
        }
        InterfaceC25186 interfaceC25186 = f77745;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13716(c6129M1365, "Effective jadx args: {}");
        }
    }
}
