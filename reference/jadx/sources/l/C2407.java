package l;

import com.alipay.sdk.m.n.c;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۖۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGH */
/* JADX INFO: loaded from: classes3.dex */
public final class C2407 extends C20372 implements InterfaceC0916 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f7724;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final C9864 f7725;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public String f7726;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public String f7727;

    public C2407(boolean z, C9864 c9864) {
        super(z);
        this.f7725 = c9864;
        m27211();
        m27209();
        m6100();
    }

    @Override // l.InterfaceC0916
    public final C9864 getKey() {
        return this.f7725;
    }

    @Override // l.C20372, l.C15150, l.InterfaceC0916
    /* JADX INFO: renamed from: ۤ */
    public final int mo3694(String str, String str2) throws SocketException, SocketTimeoutException {
        try {
            return super.mo3694(str, str2);
        } catch (SocketException e) {
            String message = e.getMessage();
            if ("Broken pipe".equalsIgnoreCase(message) || "Software caused connection abort".equalsIgnoreCase(message)) {
                try {
                    mo6118();
                } catch (IOException unused) {
                }
            }
            throw e;
        } catch (SocketTimeoutException e2) {
            try {
                mo6118();
            } catch (IOException unused2) {
            }
            throw e2;
        }
    }

    @Override // l.InterfaceC0916
    /* JADX INFO: renamed from: ۫ */
    public final IOException mo3698() throws SocketException {
        String strM36450 = m36450();
        String strValueOf = String.valueOf(m36451());
        throw new SocketException(strM36450.contains(strValueOf) ? "FTP reply: ".concat(strM36450) : ExternalValue$$ExternalSyntheticOutline0.m("FTP reply ", strValueOf, ": ", strM36450));
    }

    @Override // l.InterfaceC0916
    public final String getPath() {
        return this.f7727;
    }

    @Override // l.InterfaceC0916
    /* JADX INFO: renamed from: ֫ */
    public final String mo3684() {
        return this.f7726;
    }

    @Override // l.InterfaceC0916
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo3708(String str) throws SocketException {
        if (AbstractC7364.m20187(str).equals(this.f7727)) {
            return true;
        }
        if (!C24087.m53643(m36446(EnumC24848.CWD, str))) {
            return false;
        }
        mo3701();
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8152(boolean z) {
        this.f7724 = z;
    }

    @Override // l.C20372, l.C1727
    /* JADX INFO: renamed from: ᩴ */
    public final Socket mo6108(String str, String str2) {
        if (this.f7724) {
            Socket socket = this.f33892;
            if (socket instanceof SSLSocket ? ((SSLSocket) socket).getEnableSessionCreation() : false) {
                try {
                    m46787(false);
                    return super.mo6108(str, str2);
                } finally {
                    m46787(true);
                }
            }
        }
        return super.mo6108(str, str2);
    }

    @Override // l.C20372
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo8151(Socket socket) throws IOException {
        boolean zM8150;
        if (this.f7724 && (socket instanceof SSLSocket)) {
            SSLSession session = ((SSLSocket) this.f33892).getSession();
            if (!session.isValid()) {
                throw new IOException("Invalid SSL Session");
            }
            try {
                try {
                    if (m8149(session, socket)) {
                        zM8150 = true;
                    } else {
                        e = null;
                        try {
                            zM8150 = m8150(session, socket);
                        } catch (ReflectiveOperationException e) {
                            if (e != null) {
                                e.addSuppressed(e);
                            }
                            throw e;
                        }
                    }
                } catch (Exception e2) {
                    throw new IOException(e2);
                }
            } catch (ReflectiveOperationException e3) {
                e = e3;
            }
            if (!zM8150) {
                throw new IOException("Invalid SSL Session");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8149(SSLSession sSLSession, Socket socket) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Object obj;
        Method declaredMethod;
        Method method;
        String strValueOf;
        SSLSessionContext sessionContext = sSLSession.getSessionContext();
        Class<?> superclass = sessionContext.getClass();
        Class<?> cls = Integer.TYPE;
        Class<?>[] clsArr = {String.class, cls};
        while (true) {
            obj = null;
            if (superclass == null) {
                declaredMethod = null;
                break;
            }
            try {
                declaredMethod = superclass.getDeclaredMethod("getSession", clsArr);
                break;
            } catch (NoSuchMethodException unused) {
                superclass = superclass.getSuperclass();
            }
        }
        Class<?> superclass2 = sessionContext.getClass();
        loop1: while (true) {
            if (superclass2 == null) {
                method = null;
                break;
            }
            Method[] declaredMethods = superclass2.getDeclaredMethods();
            int length = declaredMethods.length;
            for (int i = 0; i < length; i++) {
                method = declaredMethods[i];
                if ("putSession".equals(method.getName()) && method.getParameterTypes().length == 2) {
                    break loop1;
                }
            }
            superclass2 = superclass2.getSuperclass();
        }
        if (declaredMethod != null && method != null) {
            declaredMethod.setAccessible(true);
            method.setAccessible(true);
            SSLSessionContext sessionContext2 = sSLSession.getSessionContext();
            Object objInvoke = declaredMethod.invoke(sessionContext2, sSLSession.getPeerHost(), Integer.valueOf(sSLSession.getPeerPort()));
            if (objInvoke != null) {
                obj = objInvoke;
            } else {
                Class<?> superclass3 = sessionContext2.getClass();
                while (true) {
                    if (superclass3 != null) {
                        try {
                            Field declaredField = superclass3.getDeclaredField("sessionsByHostAndPort");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(sessionContext2);
                            Map map = obj2 instanceof Map ? (Map) obj2 : new HashMap();
                            HashSet hashSetM8148 = m8148(sSLSession);
                            for (Map.Entry entry : map.entrySet()) {
                                Object key = entry.getKey();
                                try {
                                    Class<?> superclass4 = key.getClass();
                                    while (true) {
                                        if (superclass4 != null) {
                                            try {
                                                Field declaredField2 = superclass4.getDeclaredField(c.f);
                                                declaredField2.setAccessible(true);
                                                Object obj3 = declaredField2.get(key);
                                                if (obj3 != null) {
                                                    strValueOf = String.valueOf(obj3);
                                                    break;
                                                }
                                                strValueOf = null;
                                                break;
                                            } catch (NoSuchFieldException unused2) {
                                                superclass4 = superclass4.getSuperclass();
                                            }
                                        } else {
                                            throw new NoSuchFieldException(c.f);
                                        }
                                        strValueOf = null;
                                        break;
                                    }
                                } catch (NoSuchFieldException unused3) {
                                }
                                int iM8147 = m8147(entry.getKey());
                                if (strValueOf != null && iM8147 >= 0) {
                                    Iterator it = hashSetM8148.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            continue;
                                        } else if (((String) it.next()).equalsIgnoreCase(strValueOf)) {
                                            Object objInvoke2 = declaredMethod.invoke(sessionContext2, strValueOf, Integer.valueOf(iM8147));
                                            if (objInvoke2 != null) {
                                                obj = objInvoke2;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        } catch (NoSuchFieldException unused4) {
                            superclass3 = superclass3.getSuperclass();
                        }
                    } else {
                        throw new NoSuchFieldException("sessionsByHostAndPort");
                    }
                }
            }
            if (obj != null) {
                Constructor<?> declaredConstructor = method.getParameterTypes()[0].getDeclaredConstructor(String.class, cls);
                declaredConstructor.setAccessible(true);
                method.invoke(sessionContext, declaredConstructor.newInstance(socket.getInetAddress().getHostName(), Integer.valueOf(socket.getPort())), obj);
                method.invoke(sessionContext, declaredConstructor.newInstance(socket.getInetAddress().getHostAddress(), Integer.valueOf(socket.getPort())), obj);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m8150(SSLSession sSLSession, Socket socket) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        Object obj;
        String strValueOf;
        SSLSessionContext sessionContext = sSLSession.getSessionContext();
        for (Class<?> superclass = sessionContext.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField("sessionsByHostAndPort");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(sessionContext);
                Map map = obj2 instanceof Map ? (Map) obj2 : new HashMap();
                if (!map.isEmpty()) {
                    HashSet hashSetM8148 = m8148(sSLSession);
                    int peerPort = sSLSession.getPeerPort();
                    Object obj3 = null;
                    for (Object obj4 : map.keySet()) {
                        try {
                            Class<?> superclass2 = obj4.getClass();
                            while (true) {
                                if (superclass2 != null) {
                                    try {
                                        Field declaredField2 = superclass2.getDeclaredField(c.f);
                                        declaredField2.setAccessible(true);
                                        Object obj5 = declaredField2.get(obj4);
                                        if (obj5 != null) {
                                            strValueOf = String.valueOf(obj5);
                                            break;
                                        }
                                        strValueOf = null;
                                        break;
                                    } catch (NoSuchFieldException unused) {
                                        superclass2 = superclass2.getSuperclass();
                                    }
                                } else {
                                    throw new NoSuchFieldException(c.f);
                                }
                                strValueOf = null;
                                break;
                            }
                        } catch (NoSuchFieldException unused2) {
                        }
                        int iM8147 = m8147(obj4);
                        if (strValueOf != null && iM8147 >= 0) {
                            Iterator it = hashSetM8148.iterator();
                            while (it.hasNext()) {
                                if (((String) it.next()).equalsIgnoreCase(strValueOf)) {
                                    if (peerPort != iM8147) {
                                        if (obj3 != null) {
                                            break;
                                        }
                                        obj3 = obj4;
                                        break;
                                    }
                                    obj3 = obj4;
                                    break;
                                }
                            }
                        }
                    }
                    if (obj3 != null && (obj = map.get(obj3)) != null) {
                        Constructor<?> declaredConstructor = obj3.getClass().getDeclaredConstructor(String.class, Integer.TYPE);
                        declaredConstructor.setAccessible(true);
                        map.put(declaredConstructor.newInstance(socket.getInetAddress().getHostName(), Integer.valueOf(socket.getPort())), obj);
                        map.put(declaredConstructor.newInstance(socket.getInetAddress().getHostAddress(), Integer.valueOf(socket.getPort())), obj);
                        return true;
                    }
                }
                return false;
            } catch (NoSuchFieldException unused3) {
            }
        }
        throw new NoSuchFieldException("sessionsByHostAndPort");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private HashSet m8148(SSLSession sSLSession) {
        HashSet hashSet = new HashSet();
        String peerHost = sSLSession.getPeerHost();
        if (peerHost != null && !peerHost.isEmpty()) {
            hashSet.add(peerHost);
        }
        Socket socket = this.f33892;
        if (socket != null && socket.getInetAddress() != null) {
            String hostName = this.f33892.getInetAddress().getHostName();
            if (hostName != null && !hostName.isEmpty()) {
                hashSet.add(hostName);
            }
            String hostAddress = this.f33892.getInetAddress().getHostAddress();
            if (hostAddress != null && !hostAddress.isEmpty()) {
                hashSet.add(hostAddress);
            }
        }
        return hashSet;
    }

    @Override // l.C1727, l.InterfaceC0916
    /* JADX INFO: renamed from: ۤ */
    public final OutputStream mo3695(String str) throws IOException {
        try {
            Field declaredField = C1727.class.getDeclaredField("۟");
            declaredField.setAccessible(true);
            if (((Integer) declaredField.get(this)).intValue() != 2) {
                throw new IOException("FTPS storeFileStream only supports binary file type");
            }
            Socket socketM6111 = m6111(EnumC24848.STOR, str);
            if (socketM6111 == null) {
                return null;
            }
            return new C10610(socketM6111, socketM6111.getOutputStream());
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Failed to read FTP file type reflectively", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m8147(Object obj) {
        try {
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField("port");
                    declaredField.setAccessible(true);
                    return ((Integer) declaredField.get(obj)).intValue();
                } catch (NoSuchFieldException unused) {
                }
            }
            throw new NoSuchFieldException("port");
        } catch (NoSuchFieldException unused2) {
            return -1;
        }
    }

    @Override // l.InterfaceC0916
    /* JADX INFO: renamed from: ܳ */
    public final String mo3701() throws SocketException {
        String strM24272 = m36446(EnumC24848.PWD, (String) null) != 257 ? null : C9118.m24272((String) j$$ExternalSyntheticOutline0.m(this.f49434, 1));
        if (strM24272 == null) {
            mo3698();
            throw null;
        }
        String strM20187 = AbstractC7364.m20187(strM24272);
        this.f7727 = strM20187;
        if (this.f7726 == null) {
            this.f7726 = strM20187;
        }
        return strM24272;
    }
}
