.class public final synthetic Ll/ۙ᩹᩸;
.super Ljava/lang/Object;
.source "16RW"

# interfaces
.implements Ll/֫ܶ᩵;


# instance fields
.field public final synthetic ֡:Ll/ۤ᩹᩸;

.field public final synthetic ܰ:Ll/᩸᩹᩸;

.field public final synthetic ܿ:[B

.field public final synthetic ᩶:J


# direct methods
.method public synthetic constructor <init>(Ll/᩸᩹᩸;J[BLl/ۤ᩹᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ᩹᩸;->ܰ:Ll/᩸᩹᩸;

    iput-wide p2, p0, Ll/ۙ᩹᩸;->᩶:J

    iput-object p4, p0, Ll/ۙ᩹᩸;->ܿ:[B

    iput-object p5, p0, Ll/ۙ᩹᩸;->֡:Ll/ۤ᩹᩸;

    return-void
.end method


# virtual methods
.method public final ᩷(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 6

    .line 0
    check-cast p1, Ljava/lang/Long;

    iget-wide v0, p0, Ll/ۙ᩹᩸;->᩶:J

    iget-object v2, p0, Ll/ۙ᩹᩸;->֡:Ll/ۤ᩹᩸;

    iget-object v3, p0, Ll/ۙ᩹᩸;->ܰ:Ll/᩸᩹᩸;

    iget-object v5, p0, Ll/ۙ᩹᩸;->ܿ:[B

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Ll/᩸᩹᩸;->᩷(JLl/ۤ᩹᩸;Ll/᩸᩹᩸;Ljava/lang/Throwable;[B)V

    return-void
.end method
