package nas.smash.entity;

import lombok.*;
import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String title;

    @Column(length = 50, nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(length = 10000, nullable = false)
    private String content;
}
