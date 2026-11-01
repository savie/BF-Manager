package l;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۖܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8KC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2584 implements InterfaceC3560 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C8015 f10160 = new C8015(6);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaDrm f10161;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final UUID f10162;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f10163;

    @Override // l.InterfaceC3560
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo8040() {
        return 2;
    }

    @Override // l.InterfaceC3560
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo8044() {
        int i = this.f10163 - 1;
        this.f10163 = i;
        if (i == 0) {
            this.f10161.release();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3560 m8039(UUID uuid) {
        try {
            try {
                try {
                    return new C2584(uuid);
                } catch (Exception e) {
                    throw new C3995(e);
                }
            } catch (UnsupportedSchemeException e2) {
                throw new C3995(e2);
            }
        } catch (C3995 unused) {
            C0303.m1853("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C6383();
        }
    }

    public C2584(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = C1297.f5564;
        C2023.m6506("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f10162 = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(C1297.f5561)) ? uuid : uuid2);
        this.f10161 = mediaDrm;
        this.f10163 = 1;
        if (C1297.f5562.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // l.InterfaceC3560
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8045(final InterfaceC14851 interfaceC14851) {
        this.f10161.setOnEventListener(new MediaDrm.OnEventListener() { // from class: l.ܰܳۙ
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                C2584 c2584 = this.f45726;
                InterfaceC14851 interfaceC14852 = interfaceC14851;
                c2584.getClass();
                HandlerC5678 handlerC5678 = ((C2855) interfaceC14852).f10788.f71081;
                handlerC5678.getClass();
                handlerC5678.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // l.InterfaceC3560
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] mo8050() {
        return this.f10161.openSession();
    }

    @Override // l.InterfaceC3560
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo8041(byte[] bArr) {
        this.f10161.closeSession(bArr);
    }

    @Override // l.InterfaceC3560
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8046(byte[] bArr, C9724 c9724) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                C11758.m29362(this.f10161, bArr, c9724);
            } catch (UnsupportedOperationException unused) {
                C0303.m1848("setLogSessionId failed.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0247  */
    /* JADX WARN: Code duplicated, block: B:134:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2  */
    @Override // l.InterfaceC3560
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24023 mo8043(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        C18937 c18937;
        C4813 c4813M33836;
        int i3;
        int i4;
        byte[] bArrM33837;
        C4813 c4813M33837;
        UUID uuid = this.f10162;
        C18937 c18938 = null;
        if (list != null) {
            if (!C1297.f5562.equals(uuid)) {
                c18937 = (C18937) list.get(0);
            } else if (Build.VERSION.SDK_INT < 28 || list.size() <= 1) {
                i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        c18937 = (C18937) list.get(0);
                        break;
                    }
                    C18937 c18939 = (C18937) list.get(i2);
                    byte[] bArr3 = c18939.f61264;
                    bArr3.getClass();
                    c4813M33836 = C13987.m33836(bArr3);
                    if (c4813M33836 == null) {
                        i3 = -1;
                    } else {
                        i3 = c4813M33836.f16909;
                    }
                    i4 = Build.VERSION.SDK_INT;
                    if ((i4 >= 23 && i3 == 0) || (i4 >= 23 && i3 == 1)) {
                        c18937 = c18939;
                        break;
                    }
                }
            } else {
                C18937 c189310 = (C18937) list.get(0);
                int i5 = 0;
                int length = 0;
                while (true) {
                    if (i5 < list.size()) {
                        C18937 c189311 = (C18937) list.get(i5);
                        byte[] bArr4 = c189311.f61264;
                        bArr4.getClass();
                        if (!C13638.equals(c189311.f61265, c189310.f61265) || !C13638.equals(c189311.f61262, c189310.f61262) || C13987.m33836(bArr4) == null) {
                            i2 = 0;
                            while (true) {
                                if (i2 < list.size()) {
                                    c18937 = (C18937) list.get(0);
                                    break;
                                }
                                C18937 c189312 = (C18937) list.get(i2);
                                byte[] bArr5 = c189312.f61264;
                                bArr5.getClass();
                                c4813M33836 = C13987.m33836(bArr5);
                                if (c4813M33836 == null) {
                                    i3 = -1;
                                } else {
                                    i3 = c4813M33836.f16909;
                                }
                                i4 = Build.VERSION.SDK_INT;
                                i2 = i4 >= 23 ? i2 + 1 : i2 + 1;
                                c18937 = c189312;
                                break;
                            }
                        }
                        length += bArr4.length;
                        i5++;
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i6 = 0;
                        for (int i7 = 0; i7 < list.size(); i7++) {
                            byte[] bArr7 = ((C18937) list.get(i7)).f61264;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i6, length2);
                            i6 += length2;
                        }
                        c18937 = new C18937(c189310.f61263, c189310.f61262, c189310.f61265, bArr6);
                    }
                }
            }
            byte[] bArrM33838 = c18937.f61264;
            bArrM33838.getClass();
            UUID uuid2 = C1297.f5563;
            if (uuid2.equals(uuid)) {
                byte[] bArrM33839 = C13987.m33837(uuid, bArrM33838);
                if (bArrM33839 != null) {
                    bArrM33838 = bArrM33839;
                }
                C2460 c2460 = new C2460(bArrM33838);
                int iM7502 = c2460.m7502();
                short sM7536 = c2460.m7536();
                short sM7537 = c2460.m7536();
                if (sM7536 == 1 && sM7537 == 1) {
                    short sM7538 = c2460.m7536();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String strM7505 = c2460.m7505(sM7538, charset);
                    if (!strM7505.contains("<LA_URL>")) {
                        int iIndexOf = strM7505.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            C0303.m1848("Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(strM7505.substring(0, iIndexOf));
                        sb.append("<LA_URL>https://x</LA_URL>");
                        String strM1616 = C0242.m1616(iIndexOf, strM7505, sb);
                        int i8 = iM7502 + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i8);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i8);
                        byteBufferAllocate.putShort(sM7536);
                        byteBufferAllocate.putShort(sM7537);
                        byteBufferAllocate.putShort((short) (strM1616.length() * 2));
                        byteBufferAllocate.put(strM1616.getBytes(charset));
                        bArrM33838 = byteBufferAllocate.array();
                    }
                } else {
                    C0303.m1851("Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrM33838 = C13987.m33838(uuid2, null, bArrM33838);
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 27 && C13638.equals(uuid, C1297.f5561) && (c4813M33837 = C13987.m33836(bArrM33838)) != null) {
                bArrM33838 = C13987.m33838(C1297.f5564, c4813M33837.f16910, c4813M33837.f16912);
            }
            if (i9 < 23 && C1297.f5562.equals(uuid)) {
                bArrM33837 = C13987.m33837(uuid, bArrM33838);
                if (bArrM33837 != null) {
                    bArrM33838 = bArrM33837;
                }
            } else if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str2 = Build.MODEL;
                if ("AFTB".equals(str2) || "AFTS".equals(str2) || "AFTM".equals(str2) || "AFTT".equals(str2)) {
                    bArrM33837 = C13987.m33837(uuid, bArrM33838);
                    if (bArrM33837 != null) {
                        bArrM33838 = bArrM33837;
                    }
                }
            }
            String str3 = c18937.f61265;
            str = (i9 < 26 && C1297.f5561.equals(uuid) && ("video/mp4".equals(str3) || "audio/mp4".equals(str3))) ? "cenc" : str3;
            bArr2 = bArrM33838;
            c18938 = c18937;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f10161.getKeyRequest(bArr, bArr2, str, i, map);
        byte[] data = keyRequest.getData();
        if (C1297.f5561.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = C17983.m41834(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = "";
        } else if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
            String propertyString = this.f10161.getPropertyString("version");
            if (C13638.equals(propertyString, "1.2") || C13638.equals(propertyString, "aidl-1")) {
                defaultUrl = "";
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && c18938 != null) {
            String str4 = c18938.f61262;
            if (!TextUtils.isEmpty(str4)) {
                defaultUrl = str4;
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            keyRequest.getRequestType();
        }
        return new C24023(data, defaultUrl);
    }

    @Override // l.InterfaceC3560
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] mo8053(byte[] bArr, byte[] bArr2) {
        if (C1297.f5561.equals(this.f10162) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(C17983.m41834(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                C0303.m1854("Failed to adjust response data: ".concat(C17983.m41834(bArr2)), e);
            }
        }
        return this.f10161.provideKeyResponse(bArr, bArr2);
    }

    @Override // l.InterfaceC3560
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9912 mo8051() {
        MediaDrm.ProvisionRequest provisionRequest = this.f10161.getProvisionRequest();
        return new C9912(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // l.InterfaceC3560
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo8052(byte[] bArr) throws DeniedByServerException {
        this.f10161.provideProvisionResponse(bArr);
    }

    @Override // l.InterfaceC3560
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map mo8042(byte[] bArr) {
        return this.f10161.queryKeyStatus(bArr);
    }

    @Override // l.InterfaceC3560
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8048(String str, byte[] bArr) throws Throwable {
        MediaCrypto mediaCrypto;
        boolean zEquals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f10162;
        if (i >= 31) {
            boolean zEquals2 = uuid.equals(C1297.f5562);
            MediaDrm mediaDrm = this.f10161;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(C1297.f5561);
            }
            if (zEquals) {
                return C11758.m29363(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !C13638.equals(uuid, C1297.f5561)) ? uuid : C1297.f5564, bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
                    mediaCrypto.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto2 = mediaCrypto;
                    boolean z = !uuid.equals(C1297.f5561);
                    if (mediaCrypto2 != null) {
                        mediaCrypto2.release();
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto = mediaCrypto2;
        }
    }

    @Override // l.InterfaceC3560
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8047(byte[] bArr, byte[] bArr2) {
        this.f10161.restoreKeys(bArr, bArr2);
    }

    @Override // l.InterfaceC3560
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18854 mo8049(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f10162;
        if (i < 27 && C13638.equals(uuid, C1297.f5561)) {
            uuid = C1297.f5564;
        }
        return new C4701(uuid, bArr);
    }
}
