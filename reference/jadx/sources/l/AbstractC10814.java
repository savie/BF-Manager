package l;

import com.umeng.analytics.pro.cb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.jar.Attributes;

/* JADX INFO: renamed from: l.ۤۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I1VO */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10814 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f34298 = {cb.k, 10};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27548(ByteArrayOutputStream byteArrayOutputStream, String str, Attributes attributes) throws IOException {
        m27550(byteArrayOutputStream, "Name", str);
        if (!attributes.isEmpty()) {
            m27551(byteArrayOutputStream, m27546(attributes));
        }
        byteArrayOutputStream.write(f34298);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27547(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byteArrayOutputStream.write(f34298);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27549(ByteArrayOutputStream byteArrayOutputStream, Attributes.Name name, String str) throws IOException {
        m27550(byteArrayOutputStream, name.toString(), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27550(OutputStream outputStream, String str, String str2) throws IOException {
        int iMin;
        byte[] bytes = C20196.m46451(str, ": ", str2).getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        boolean z = true;
        int i = 0;
        while (true) {
            byte[] bArr = f34298;
            if (length <= 0) {
                outputStream.write(bArr);
                return;
            }
            if (z) {
                iMin = Math.min(length, 70);
            } else {
                outputStream.write(bArr);
                outputStream.write(32);
                iMin = Math.min(length, 69);
            }
            outputStream.write(bytes, i, iMin);
            i += iMin;
            length -= iMin;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static TreeMap m27546(Attributes attributes) {
        Set<Map.Entry<Object, Object>> setEntrySet = attributes.entrySet();
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<Object, Object> entry : setEntrySet) {
            treeMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27551(OutputStream outputStream, TreeMap treeMap) throws IOException {
        for (Map.Entry entry : treeMap.entrySet()) {
            m27550(outputStream, (String) entry.getKey(), (String) entry.getValue());
        }
    }
}
