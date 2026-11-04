.class public final Ll/ܺ᩻᩷;
.super Ljava/lang/Object;
.source "68GQ"


# instance fields
.field public final ۙ:Ljava/io/ByteArrayOutputStream;

.field public final ᩷:Ljava/io/DataOutputStream;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x200

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    iput-object v0, p0, Ll/ܺ᩻᩷;->ۙ:Ljava/io/ByteArrayOutputStream;

    .line 34
    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v1, p0, Ll/ܺ᩻᩷;->᩷:Ljava/io/DataOutputStream;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۧ᩻᩷;)[B
    .locals 4

    .line 45
    iget-object v0, p0, Ll/ܺ᩻᩷;->᩷:Ljava/io/DataOutputStream;

    iget-object v1, p0, Ll/ܺ᩻᩷;->ۙ:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 47
    :try_start_0
    iget-object v2, p1, Ll/ۧ᩻᩷;->ᩴ:Ljava/lang/String;

    .line 63
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 64
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 48
    iget-object v3, p1, Ll/ۧ᩻᩷;->ܳ:Ljava/lang/String;

    .line 63
    invoke-virtual {v0, v3}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 64
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 50
    iget-wide v2, p1, Ll/ۧ᩻᩷;->ۙ:J

    invoke-virtual {v0, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 51
    iget-wide v2, p1, Ll/ۧ᩻᩷;->ۤ:J

    invoke-virtual {v0, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 52
    iget-object p1, p1, Ll/ۧ᩻᩷;->᩸:[B

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 53
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 54
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 57
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
