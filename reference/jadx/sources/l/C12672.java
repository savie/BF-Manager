package l;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6GY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12672 extends DataInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ByteArrayInputStream f40595;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6707 f40596;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f40597;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C12672(C6707 c6707, int i, int i2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c6707.f22310, i, i2);
        this.f40596 = c6707;
        super(byteArrayInputStream);
        this.f40595 = byteArrayInputStream;
        this.f40597 = i + i2;
    }

    public final int position() {
        return this.f40597 - this.f40595.available();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private List m31442(int i, int i2, boolean z) throws IOException {
        if (i > this.f40595.available()) {
            throw new IOException("Invalid type count");
        }
        List arrayList = z ? new ArrayList(i) : Collections.EMPTY_LIST;
        for (int i3 = 0; i3 < i; i3++) {
            String strM31443 = m31443(i2, z);
            if (z) {
                arrayList.add(strM31443);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m31447() {
        return this.f40595.available();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m31444() {
        int unsignedByte = readUnsignedByte();
        Charset charset = StandardCharsets.US_ASCII;
        if (unsignedByte > this.f40595.available()) {
            throw new IOException("Truncated class set string");
        }
        byte[] bArr = new byte[unsignedByte];
        readFully(bArr);
        return new String(bArr, charset);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m31448() {
        int unsignedShort = readUnsignedShort();
        Charset charset = StandardCharsets.UTF_8;
        if (unsignedShort > this.f40595.available()) {
            throw new IOException("Truncated class set string");
        }
        byte[] bArr = new byte[unsignedShort];
        readFully(bArr);
        return new String(bArr, charset);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m31449(boolean z) {
        byte b = readByte();
        if (b == -1 || b == 0) {
            return Collections.EMPTY_LIST;
        }
        if (b == -2) {
            return z ? Collections.singletonList("Ljava/lang/Object;") : Collections.EMPTY_LIST;
        }
        if (b < 0) {
            throw new IOException("Invalid parent count");
        }
        return m31442(b, 0, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m31445(int i, boolean z) {
        return m31442(readUnsignedByte(), i, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20877 m31446(boolean z) {
        String strM31444 = m31444();
        List listM31445 = m31445(0, z);
        String strM31443 = m31443(0, z);
        m31445(0, false);
        m31443(0, false);
        m31445(0, false);
        int i = readInt();
        m31445(0, false);
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder(strM31444);
        sb.append('(');
        Iterator it = listM31445.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        sb.append(')');
        sb.append(strM31443);
        return new C20877(sb.toString(), i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m31443(int i, boolean z) throws IOException {
        if (i > 64) {
            throw new IOException("Excessive type nesting");
        }
        byte b = readByte();
        switch (b) {
            case -1:
                return null;
            case 0:
                if (readByte() != 0) {
                    return m31443(i + 1, z);
                }
                if (z) {
                    return "Ljava/lang/Object;";
                }
                return null;
            case 1:
            case 4:
                int i2 = readInt();
                if (i2 >= 0) {
                    C6707 c6707 = this.f40596;
                    if (i2 < c6707.f22307.length) {
                        if (b == 1) {
                            m31445(i + 1, false);
                        }
                        if (z) {
                            return c6707.f22307[i2];
                        }
                        return null;
                    }
                }
                throw new IOException("Invalid type index");
            case 2:
                m31444();
                List listM31445 = m31445(i + 1, z);
                if (z) {
                    return listM31445.isEmpty() ? "Ljava/lang/Object;" : (String) listM31445.get(0);
                }
                return null;
            case 3:
                int i3 = i + 1;
                m31443(i3, false);
                return m31443(i3, z);
            case 5:
                String strM31443 = m31443(i + 1, z);
                if (z) {
                    return C25272.m56409("[", strM31443);
                }
                return null;
            case 6:
                char unsignedByte = (char) readUnsignedByte();
                if ("VZBSCIJFD".indexOf(unsignedByte) < 0) {
                    throw new IOException("Invalid primitive type");
                }
                if (z) {
                    return String.valueOf(unsignedByte);
                }
                return null;
            default:
                throw new IOException("Invalid type kind");
        }
    }
}
