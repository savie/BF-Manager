package l;

import com.umeng.analytics.pro.am;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۜ֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6CM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6765 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f22569 = Pattern.compile(".*(\\d+)$");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f22570;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f22571;

    public C6765(C11984 c11984, C2551 c2551) {
        HashSet hashSet = new HashSet();
        this.f22571 = hashSet;
        this.f22570 = c11984.m30110();
        if (!c2551.mo8547().m26540()) {
            hashSet.add("this");
            hashSet.add("super");
        }
        C6765 c6765M30116 = c11984.m30116();
        if (c6765M30116 != null) {
            hashSet.addAll(c6765M30116.f22571);
        }
        C24927 c24927M8536 = c2551.m8536();
        for (C17467 c17467 : c24927M8536.getFields()) {
            if (c17467.m40969()) {
                hashSet.add(c17467.m40967());
            }
        }
        Iterator it = c24927M8536.m55534().iterator();
        while (it.hasNext()) {
            hashSet.add(((C24927) it.next()).m55571().m4965());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18893(C6765 c6765) {
        this.f22571.addAll(c6765.f22571);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m18890(C11260 c11260) {
        boolean z = this.f22570;
        String str = am.aE;
        if (!z) {
            if (c11260.m28512()) {
                return "this";
            }
            String strM28513 = c11260.m28513();
            if (strM28513 == null || strM28513.isEmpty()) {
                List listM28519 = c11260.m28519();
                if (!listM28519.isEmpty()) {
                    str = "r" + ((C17973) listM28519.get(0)).m41930().m17532();
                }
                strM28513 = str;
            }
            String strM18888 = m18888(strM28513);
            c11260.m28506(strM18888);
            return strM18888;
        }
        List listM285110 = c11260.m28519();
        if (listM285110.isEmpty()) {
            return am.aE;
        }
        return "r" + ((C17973) listM285110.get(0)).m41930().m17532();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m18891(C20211 c20211) {
        String name = c20211.getName();
        if (this.f22570) {
            return name;
        }
        String strM18888 = m18888(name);
        c20211.setName(strM18888);
        return strM18888;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m18889(C6041 c6041) {
        String name = c6041.getName();
        if (name != null && !this.f22570) {
            return name;
        }
        return "r" + c6041.m17532();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m18892(C25212 c25212) {
        String str = "loop" + c25212.m56214().m29623();
        this.f22571.add(str);
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m18888(String str) {
        int i;
        HashSet hashSet = this.f22571;
        if (!hashSet.contains(str)) {
            hashSet.add(str);
            return str;
        }
        Matcher matcher = f22569.matcher(str);
        if (matcher.matches()) {
            str = str.substring(0, matcher.start(1));
            i = Integer.parseInt(matcher.group(1)) + 1;
        } else {
            i = 2;
        }
        while (true) {
            StringBuilder sbM27333 = C10732.m27333(str);
            int i2 = i + 1;
            sbM27333.append(i);
            String string = sbM27333.toString();
            if (!hashSet.contains(string)) {
                hashSet.add(string);
                return string;
            }
            i = i2;
        }
    }
}
