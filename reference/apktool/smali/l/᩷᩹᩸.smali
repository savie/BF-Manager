.class public final synthetic Ll/᩷᩹᩸;
.super Ljava/lang/Object;
.source "16RW"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:[B

.field public final synthetic ۟:Ll/ۤ᩹᩸;

.field public final synthetic ܰ:Ll/᩸᩹᩸;

.field public final synthetic ܿ:J

.field public final synthetic ᩶:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(JLl/ۤ᩹᩸;Ll/᩸᩹᩸;Ljava/lang/Throwable;[B)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ll/᩷᩹᩸;->ܰ:Ll/᩸᩹᩸;

    iput-object p5, p0, Ll/᩷᩹᩸;->᩶:Ljava/lang/Throwable;

    iput-wide p1, p0, Ll/᩷᩹᩸;->ܿ:J

    iput-object p6, p0, Ll/᩷᩹᩸;->֡:[B

    iput-object p3, p0, Ll/᩷᩹᩸;->۟:Ll/ۤ᩹᩸;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 0
    iget-object v5, p0, Ll/᩷᩹᩸;->֡:[B

    iget-object v2, p0, Ll/᩷᩹᩸;->۟:Ll/ۤ᩹᩸;

    iget-wide v0, p0, Ll/᩷᩹᩸;->ܿ:J

    iget-object v3, p0, Ll/᩷᩹᩸;->ܰ:Ll/᩸᩹᩸;

    iget-object v4, p0, Ll/᩷᩹᩸;->᩶:Ljava/lang/Throwable;

    invoke-static/range {v0 .. v5}, Ll/᩸᩹᩸;->ۙ(JLl/ۤ᩹᩸;Ll/᩸᩹᩸;Ljava/lang/Throwable;[B)V

    return-void
.end method
