package l;

import com.umeng.analytics.pro.bo;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20172 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11967 f64786;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f64788 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f64787 = new ArrayList();

    public C20172(C11967 c11967) {
        this.f64786 = c11967;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46399() {
        for (C16946 c16946 : ((HashMap) this.f64786.f38534).values()) {
            if (c16946.f55357 != null) {
                this.f64787.add(c16946);
            } else if (c16946.f55363 != null) {
                this.f64788.add(c16946);
            } else {
                throw new IOException("Bad xml item: " + c16946.f55358);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m46400() {
        ArrayList arrayList = this.f64788;
        Collections.sort(arrayList);
        ArrayList<C16946> arrayList2 = this.f64787;
        Collections.sort(arrayList2);
        MessageDigest messageDigestM36179 = C15022.m36179();
        messageDigestM36179.update((byte) -127);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            messageDigestM36179.update(((C16946) it.next()).f55358.getBytes(Charset.defaultCharset()));
        }
        messageDigestM36179.update(bo.h);
        for (C16946 c16946 : arrayList2) {
            messageDigestM36179.update(c16946.f55358.getBytes(Charset.defaultCharset()));
            messageDigestM36179.update(c16946.f55357.m24700());
        }
        messageDigestM36179.update((byte) -123);
        return messageDigestM36179.digest();
    }
}
