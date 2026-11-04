package l;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes3.dex */
public class C5224 implements InterfaceC13530 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15712(long j) {
        int i = 0;
        do {
            i++;
            j >>= 7;
        } while (j != 0);
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo15714(EnumC24309 enumC24309) {
        throw null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void mo15716(EnumC24309 enumC24309) {
        throw null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo15717(EnumC24309 enumC24309) {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo15718(EnumC24309 enumC24309) {
        throw null;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void mo15719(EnumC24309 enumC24309) {
        throw null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void mo15720(EnumC24309 enumC24309) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void mo15721(EnumC24309 enumC24309) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo15722(EnumC24309 enumC24309) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void mo15723(EnumC24309 enumC24309) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void mo15724(EnumC24309 enumC24309) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15713(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            return Arrays.equals((Object[]) obj, (Object[]) obj2);
        }
        if (!(obj instanceof CharSequence) || !(obj2 instanceof CharSequence)) {
            return obj.equals(obj2);
        }
        return TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m15715(EnumC24309 enumC24309) {
        switch (enumC24309.ordinal()) {
            case 0:
            case 1:
                mo15714(enumC24309);
                break;
            case 2:
                mo15719(enumC24309);
                break;
            case 3:
            case 4:
                mo15724(enumC24309);
                break;
            case 5:
            case 6:
            case 7:
                mo15717(enumC24309);
                break;
            case 8:
                mo15721(enumC24309);
                break;
            case 9:
                mo15716(enumC24309);
                break;
            case 10:
            case 11:
                mo15723(enumC24309);
                break;
            case 12:
                mo15722(enumC24309);
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                mo15720(enumC24309);
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                mo15718(enumC24309);
                break;
        }
    }
}
