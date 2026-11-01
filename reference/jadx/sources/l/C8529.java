package l;

import java.io.IOException;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۡ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5XS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8529 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22286(C9841 c9841, long j) {
        C17706 c17706 = c9841.f33623;
        if (c17706 != null) {
            for (C11107 c11107 : c17706.f56222) {
                switch (C7823.f25754[c11107.mo4758().ordinal()]) {
                    case 1:
                        if (((C21689) c11107).mo6779() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        if (c11107.mo6779() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 6:
                        if (c11107.mo6779() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 7:
                        if (((C4880) c11107).mo6779() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 8:
                        Iterator itM24920 = ((C9820) c11107).m24920();
                        while (itM24920.hasNext()) {
                            if (j == ((C2057) itM24920.next()).f7635) {
                                return true;
                            }
                        }
                        break;
                    case 9:
                        Iterator itM49666 = ((C22395) c11107).m49666();
                        while (itM49666.hasNext()) {
                            C5461 c5461 = (C5461) itM49666.next();
                            int i = (c5461.f18828 + c5461.f18827) - 1;
                            long j2 = 0;
                            int i2 = 0;
                            while (i >= c5461.f18828) {
                                j2 = (j2 << (i2 * 8)) | ((long) (c5461.f18826[i] & 255));
                                i--;
                                i2++;
                            }
                            if (j2 == j) {
                                return true;
                            }
                        }
                        break;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22287(C9841 c9841, String str) {
        if (c9841.f33621.f65771.m35176().toLowerCase().contains(str)) {
            return true;
        }
        C17706 c17706 = c9841.f33623;
        if (c17706 != null) {
            for (AbstractC4300 abstractC4300 : c17706.f56222) {
                switch (C7823.f25754[abstractC4300.mo4758().ordinal()]) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        EnumC12768 enumC12768 = abstractC4300.f15468.f3348;
                        if (enumC12768 == EnumC12768.string) {
                            if (((C14655) ((AbstractC11357) abstractC4300).m28439()).m35176().toLowerCase().contains(str)) {
                                return true;
                            }
                        } else if (enumC12768 == EnumC12768.method) {
                            C20299 c20299 = (C20299) ((AbstractC11357) abstractC4300).m28439();
                            if (c20299.f65771.m35176().toLowerCase().contains(str) || c20299.f65773.m6314().toLowerCase().contains(str) || c20299.f65772.m40672().toLowerCase().contains(str)) {
                                return true;
                            }
                        } else if (enumC12768 != EnumC12768.field) {
                            continue;
                        } else {
                            C18888 c18888 = (C18888) ((AbstractC11357) abstractC4300).m28439();
                            if (c18888.f61164.m35176().toLowerCase().contains(str) || c18888.f61162.m6314().toLowerCase().contains(str) || c18888.f61160.m6314().toLowerCase().contains(str)) {
                                return true;
                            }
                        }
                        break;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22288(C9841 c9841, Pattern pattern) {
        C5706 c5706 = new C5706(c9841.f33623);
        StringBuilder sb = new StringBuilder(4096);
        try {
            c5706.m15741(new C16516(sb));
            return pattern.matcher(sb.toString()).find();
        } catch (IOException unused) {
            return false;
        }
    }
}
